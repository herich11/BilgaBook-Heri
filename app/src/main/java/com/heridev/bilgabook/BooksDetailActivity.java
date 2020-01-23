package com.heridev.bilgabook;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

@SuppressLint("Registered")
public class BooksDetailActivity extends AppCompatActivity {

    public static String EXTRA_PHOTO = "book_photo";
    public static String EXTRA_TITLE = "book_title";
    public static String EXTRA_SUBT = "book_subtitle";
    public static String EXTRA_AUTH = "book_author";
    public static String EXTRA_HARD = "book_hardcover";
    public static String EXTRA_PUBL = "book_publisher";
    public static String EXTRA_LANG = "book_language";
    public static String EXTRA_ISBN = "book_isbn10";
    public static String EXTRA_ISB1 = "book_isbn13";
    public static String EXTRA_DIME = "book_dimension";
    public static String EXTRA_WEIG = "book_weight";
    public static String EXTRA_REVI = "book_review";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        ImageView bookPhoto = findViewById(R.id.iv_book_photo);
        TextView bookTitle = findViewById(R.id.tv_book_title);
        TextView bookSubtitle = findViewById(R.id.tv_book_subtitle);
        TextView bookAuthor = findViewById(R.id.tv_book_author);
        TextView bookHardcover = findViewById(R.id.tv_book_hardcover);
        TextView bookPublisher = findViewById(R.id.tv_book_publisher);
        TextView bookLanguage = findViewById(R.id.tv_book_language);
        TextView bookIsbn10 = findViewById(R.id.tv_book_isbn10);
        TextView bookIsbn13 = findViewById(R.id.tv_book_isbn13);
        TextView bookDimension = findViewById(R.id.tv_book_dimension);
        TextView bookWeight = findViewById(R.id.tv_book_weight);
        TextView bookReview = findViewById(R.id.tv_book_review);

        Glide.with(this).load(getIntent().getStringExtra(EXTRA_PHOTO)).into(bookPhoto);
        bookTitle.setText(getIntent().getStringExtra(EXTRA_TITLE));
        bookSubtitle.setText(getIntent().getStringExtra(EXTRA_SUBT));
        bookAuthor.setText(getIntent().getStringExtra(EXTRA_AUTH));
        bookHardcover.setText(getIntent().getStringExtra(EXTRA_HARD));
        bookPublisher.setText(getIntent().getStringExtra(EXTRA_PUBL));
        bookLanguage.setText(getIntent().getStringExtra(EXTRA_LANG));
        bookIsbn10.setText(getIntent().getStringExtra(EXTRA_ISBN));
        bookIsbn13.setText(getIntent().getStringExtra(EXTRA_ISB1));
        bookDimension.setText(getIntent().getStringExtra(EXTRA_DIME));
        bookWeight.setText(getIntent().getStringExtra(EXTRA_WEIG));
        bookReview.setText(getIntent().getStringExtra(EXTRA_REVI));

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detail " + getIntent().getStringExtra(EXTRA_TITLE));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
