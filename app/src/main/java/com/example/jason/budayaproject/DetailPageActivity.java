package com.example.jason.budayaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.jason.budayaproject.Adapter.MakananAdapter;
import com.example.jason.budayaproject.Adapter.WisataAdapter;
import com.example.jason.budayaproject.Data.Makanan;
import com.example.jason.budayaproject.Data.wisata;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailPageActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbar;
    Toolbar toolbar;
    RecyclerView rv_foto_wisata,rv_jajanan_wisata;
    String nama_wisata,path;

    public MakananAdapter makananAdapter;

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;

    //FirebaseDatabase database;
    DatabaseReference database;
    List<Makanan> makanans;

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
        rv_foto_wisata = findViewById(R.id.rv_foto_wisata);
        rv_jajanan_wisata = findViewById(R.id.rv_jajanan_wisata);
        collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        toolbar = findViewById(R.id.toolbar);
        nama_wisata = getIntent().getStringExtra("namawisata");
        txt_nama_wisata.setText(nama_wisata);
        path = getIntent().getStringExtra("gambar");
        Picasso.with(DetailPageActivity.this).load(path).into(img_wisata);
        setToolbar();
        auth = FirebaseAuth.getInstance();

        database = FirebaseDatabase.getInstance().getReference();

        rv_jajanan_wisata.setItemAnimator(new DefaultItemAnimator());
        rv_jajanan_wisata.setHasFixedSize(true);
        rv_jajanan_wisata.setLayoutManager(new LinearLayoutManager(DetailPageActivity.this, LinearLayoutManager.HORIZONTAL, false));

        database.child("Makanan").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                makanans = new ArrayList<>();
                for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()){
                    Makanan data = noteDataSnapshot.getValue(Makanan.class);
                    Log.e("nama", data.getNama());
                    makanans.add(data);
                }
                makananAdapter = new MakananAdapter(makanans,DetailPageActivity.this);
                rv_jajanan_wisata.setAdapter(makananAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPageActivity.this, PaymentActivity.class);
                intent.putExtra("nama",nama_wisata);
                intent.putExtra("gambar",path);
                startActivity(intent);
            }
        });

    }
    private void setToolbar() {
        collapsingToolbar.setContentScrimColor(ContextCompat.getColor(DetailPageActivity.this, R.color.colorPrimary));
        collapsingToolbar.setTitle(nama_wisata);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedToolbar);
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.ExpandedToolbar);
        collapsingToolbar.setTitleEnabled(true);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
        } else {

        }
    }
}
