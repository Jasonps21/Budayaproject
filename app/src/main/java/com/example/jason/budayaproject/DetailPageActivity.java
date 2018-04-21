package com.example.jason.budayaproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailPageActivity extends AppCompatActivity {

    Button btn_pesan = findViewById(R.id.btn_pesan);
    TextView txt_nama_wisata = findViewById(R.id.txt_nama_wisata);
    TextView txt_detail_wisata = findViewById(R.id.txt_detail_wisata);
    TextView txt_jam_operasi = findViewById(R.id.txt_jam_operasi);
    TextView txt_harga_tiket = findViewById(R.id.txt_harga_tiket);
    RatingBar rating_bar = findViewById(R.id.rating_bar);
    RecyclerView rv_foto_wisata = findViewById(R.id.rv_foto_wisata);
    RecyclerView rv_jajanan_wisata = findViewById(R.id.rv_jajanan_wisata);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);
    }
}
