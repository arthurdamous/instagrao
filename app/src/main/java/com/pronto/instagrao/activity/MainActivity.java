package com.pronto.instagrao.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Menu;

import com.pronto.instagrao.R;
import com.pronto.instagrao.adapters.FeedAdapter;
import com.pronto.instagrao.adapters.StoriesAdapter;
import com.pronto.instagrao.data.Publicacao;
import com.pronto.instagrao.data.Stories;
import com.pronto.instagrao.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    private List<Publicacao> publicacoes;
    private List<Stories> stories;
    private FeedAdapter feedAdapter;
    private StoriesAdapter storiesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_topo, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void init() {
        setSupportActionBar(binding.toolbarTop);
        publicacoes = new ArrayList<>();
        stories = new ArrayList<>();
        publicacoes.add(new Publicacao("04/2020", R.drawable.cap2, "Um dia maravilhoso com meu carro novo, olhem esta foto que eu tirei onteom dele.", 57, 13));
        publicacoes.add(new Publicacao("05/2020", R.drawable.cap3, "Estava eu andando pela cidade, acabei encontrando este carro sem ninguém, peguei para mim", 60, 13));
        publicacoes.add(new Publicacao("06/2020", R.drawable.cap4, "Ganhei este no carimbó da sorte, estou muito sortudo por que ganhei no carimbó da sorte", 35, 13));
        stories.add(new Stories(R.drawable.person3));
        stories.add(new Stories(R.drawable.person4));
        stories.add(new Stories(R.drawable.person5));
        stories.add(new Stories(R.drawable.person6));
        stories.add(new Stories(R.drawable.person3));
        stories.add(new Stories(R.drawable.person4));
        stories.add(new Stories(R.drawable.person5));
        stories.add(new Stories(R.drawable.person6));
        stories.add(new Stories(R.drawable.person3));
        stories.add(new Stories(R.drawable.person4));
        stories.add(new Stories(R.drawable.person5));
        stories.add(new Stories(R.drawable.person6));
        setupRecyclerFeed(publicacoes);
        setupRecyclerStories(stories);
    }

    private void setupRecyclerStories(List<Stories> stories) {
        this.stories = stories;
        storiesAdapter = new StoriesAdapter();
        storiesAdapter.submitList(stories);
        binding.rvStories.setAdapter(storiesAdapter);
        binding.rvStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void setupRecyclerFeed(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
        feedAdapter = new FeedAdapter();
        feedAdapter.submitList(this.publicacoes);
        binding.rvFeed.setAdapter(feedAdapter);
        binding.rvFeed.setLayoutManager(new LinearLayoutManager(this));
    }

}