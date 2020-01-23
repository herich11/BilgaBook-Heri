package com.heridev.bilgabook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.heridev.bilgabook.adapters.ListBookAdapter;
import com.heridev.bilgabook.dummy.BookDummy;
import com.heridev.bilgabook.models.Book;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBook;
    private ArrayList<Book> listBook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBook = findViewById(R.id.rv_book);
        rvBook.setHasFixedSize(true);
        listBook.addAll(BookDummy.getData());

        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.about_me) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter ListBookAdapter = new ListBookAdapter(listBook);
        rvBook.setAdapter(ListBookAdapter);
        ListBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                moveToDetail(data);
            }
        });

    }

    private void moveToDetail(Book data) {
        Intent intent = new Intent(MainActivity.this, BooksDetailActivity.class);
        intent.putExtra(BooksDetailActivity.EXTRA_PHOTO, data.getPhoto());
        intent.putExtra(BooksDetailActivity.EXTRA_TITLE, data.getTitle());
        intent.putExtra(BooksDetailActivity.EXTRA_SUBT, data.getSubtitle());
        intent.putExtra(BooksDetailActivity.EXTRA_AUTH, data.getAuthor());
        intent.putExtra(BooksDetailActivity.EXTRA_HARD, data.getHardcover());
        intent.putExtra(BooksDetailActivity.EXTRA_PUBL, data.getPublisher());
        intent.putExtra(BooksDetailActivity.EXTRA_LANG, data.getLanguage());
        intent.putExtra(BooksDetailActivity.EXTRA_ISBN, data.getIsbn10());
        intent.putExtra(BooksDetailActivity.EXTRA_ISB1, data.getIsbn13());
        intent.putExtra(BooksDetailActivity.EXTRA_DIME, data.getDimension());
        intent.putExtra(BooksDetailActivity.EXTRA_WEIG, data.getWeight());
        intent.putExtra(BooksDetailActivity.EXTRA_REVI, data.getReview());

        startActivity(intent);
    }
}
