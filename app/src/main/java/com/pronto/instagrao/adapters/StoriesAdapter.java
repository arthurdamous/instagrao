package com.pronto.instagrao.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.pronto.instagrao.data.Publicacao;
import com.pronto.instagrao.data.Stories;
import com.pronto.instagrao.databinding.ItemPubConstBinding;
import com.pronto.instagrao.databinding.ItemStoriesBinding;
import com.pronto.instagrao.holder.FeedHolder;
import com.pronto.instagrao.holder.StoriesHolder;

public class StoriesAdapter extends ListAdapter<Stories, StoriesHolder> {


    public StoriesAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public StoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StoriesHolder(ItemStoriesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesHolder holder, int position) {
        holder.bind(getCurrentList().get(position));
    }

    public static DiffUtil.ItemCallback<Stories> DIFF_CALLBACK = new DiffUtil.ItemCallback<Stories>() {
        @Override
        public boolean areItemsTheSame(@NonNull Stories oldItem, @NonNull Stories newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Stories oldItem, @NonNull Stories newItem) {
            return false;
        }
    };
}
