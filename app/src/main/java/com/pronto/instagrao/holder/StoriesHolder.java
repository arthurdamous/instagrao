package com.pronto.instagrao.holder;

import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pronto.instagrao.data.Stories;
import com.pronto.instagrao.databinding.ItemPubConstBinding;
import com.pronto.instagrao.databinding.ItemStoriesBinding;

public class StoriesHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ItemStoriesBinding binding;
    private Stories stories;
    private AdapterView.OnItemClickListener onItemClickListener;

    public StoriesHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemStoriesBinding.bind(itemView);
        itemView.setOnClickListener(this);
    }

    public void bind(Stories stories){
        this.stories = stories;
        binding.ivwStoriesUser.setImageResource(stories.getImgStorie());
    }

    @Override
    public void onClick(View v) {

    }
}
