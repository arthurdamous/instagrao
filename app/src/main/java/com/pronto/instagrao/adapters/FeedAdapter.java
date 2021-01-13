package com.pronto.instagrao.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.pronto.instagrao.data.Publicacao;
import com.pronto.instagrao.databinding.ItemPubConstBinding;
import com.pronto.instagrao.holder.FeedHolder;

public class FeedAdapter extends ListAdapter<Publicacao, FeedHolder> {

    public FeedAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public FeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FeedHolder(ItemPubConstBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull FeedHolder holder, int position) {
        holder.bind(getCurrentList().get(position));
    }

    public static DiffUtil.ItemCallback<Publicacao> DIFF_CALLBACK = new DiffUtil.ItemCallback<Publicacao>() {
        @Override
        public boolean areItemsTheSame(@NonNull Publicacao oldItem, @NonNull Publicacao newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Publicacao oldItem, @NonNull Publicacao newItem) {
            return false;
        }
    };

}
