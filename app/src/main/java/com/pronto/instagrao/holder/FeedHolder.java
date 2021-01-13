package com.pronto.instagrao.holder;

import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pronto.instagrao.data.Publicacao;
import com.pronto.instagrao.databinding.ItemPubConstBinding;

public class FeedHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ItemPubConstBinding binding;
    private Publicacao publicacao;
    private AdapterView.OnItemClickListener onItemClickListener;

    public FeedHolder(@NonNull View itemView) {
        super(itemView);
        //this.onItemClickListener = onItemClickListener;
        binding = ItemPubConstBinding.bind(itemView);
        itemView.setOnClickListener(this);
    }

    public void bind(Publicacao publicacao){
        this.publicacao = publicacao;
        binding.tvwTextPubUser.setText(publicacao.getTextoPublicacao());
        binding.tvwTextVerTodosCom.setText("Ver todos os "+publicacao.getQtdComentarios()+" comentários");
        binding.tvwUserLike.setText(""+publicacao.getQtdLikes());
        binding.tvwUserOthers.setText(" pessoas");
        binding.ivwPubPrincipal.setImageResource(publicacao.getCaminhoImagem());
    }

    @Override
    public void onClick(View view) {

    }
}
