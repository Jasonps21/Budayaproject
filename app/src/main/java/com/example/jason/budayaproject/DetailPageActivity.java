package com.example.jason.budayaproject;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailPageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);
        Button btn_pesan = findViewById(R.id.btn_pesan);
        TextView txt_nama_wisata = findViewById(R.id.txt_nama_wisata);
        TextView txt_detail_wisata = findViewById(R.id.txt_detail_wisata);
        TextView txt_jam_operasi = findViewById(R.id.txt_jam_operasi);
        TextView txt_harga_tiket = findViewById(R.id.txt_harga_tiket);
        RatingBar rating_bar = findViewById(R.id.rating_bar);
        ImageView img_wisata = findViewById(R.id.img_tempat);
        RecyclerView rv_foto_wisata = findViewById(R.id.rv_foto_wisata);
        RecyclerView rv_jajanan_wisata = findViewById(R.id.rv_jajanan_wisata);

        txt_nama_wisata.setText(getIntent().getStringExtra("namawisata"));
        String path = getIntent().getStringExtra("gambar");
        Picasso.with(DetailPageActivity.this).load(path).into(img_wisata);


    }
}
