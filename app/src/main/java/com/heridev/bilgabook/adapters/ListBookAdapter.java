package com.heridev.bilgabook.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.heridev.bilgabook.R;
import com.heridev.bilgabook.models.Book;

import java.util.ArrayList;

public class ListBookAdapter extends RecyclerView.Adapter<ListBookAdapter.ListViewHolder> {

    public interface OnItemClickCallback {
        void onItemClicked(Book data);
    }
    private OnItemClickCallback onItemClickCallback;
    private ArrayList<Book> listBook;

    public ListBookAdapter(ArrayList<Book> book) {
        this.listBook = book;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvTitle.setText(book.getTitle());
        holder.tvReview.setText(book.getReview());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listBook.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvTitle, tvSubtitle, tvAuthor, tvHardcover, tvPublisher, tvLanguage, tvIsbn10,tvIsbn13, tvDimension, tvWeight, tvReview;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvSubtitle = itemView.findViewById(R.id.tv_item_subtitle);
            tvAuthor = itemView.findViewById(R.id.tv_item_author);
            tvHardcover = itemView.findViewById(R.id.tv_item_hardcover);
            tvPublisher = itemView.findViewById(R.id.tv_item_publisher);
            tvLanguage = itemView.findViewById(R.id.tv_item_language);
            tvIsbn10 = itemView.findViewById(R.id.tv_item_isbn10);
            tvIsbn13 = itemView.findViewById(R.id.tv_item_isbn13);
            tvDimension = itemView.findViewById(R.id.tv_item_dimension);
            tvWeight = itemView.findViewById(R.id.tv_item_weight);
            tvReview = itemView.findViewById(R.id.tv_item_review);
        }
    }
}
