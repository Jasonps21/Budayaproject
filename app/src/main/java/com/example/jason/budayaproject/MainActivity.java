package com.example.jason.budayaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_wisata;
    WisataAdapter wisataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_wisata = (RecyclerView) findViewById(R.id.rv_wisata);
        rv_wisata.setItemAnimator(new DefaultItemAnimator());
        //List<wisata> movies = jsonUtils.getAllMovies(s);
        //wisataAdapter = new WisataAdapter(movies,MainActivity.this);
        rv_wisata.setAdapter(wisataAdapter);
    }
}
