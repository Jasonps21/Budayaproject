package com.example.jason.budayaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PaymentActivity extends AppCompatActivity {

    TextView txt_nama_wisata, txt_detail_wisata,txt_tanggal_expire,txt_jmh_pesanan,txt_total_harga;

    Button btn_kurang, btn_tambah, btn_pesan;

    String nama_wisata, path;
    ImageView img_tempat;

    EditText edt_kode_promo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        txt_nama_wisata = findViewById(R.id.txt_nama_wisata);
        txt_detail_wisata = findViewById(R.id.txt_detail_wisata);
        txt_tanggal_expire = findViewById(R.id.txt_tanggal_expire);
        txt_jmh_pesanan = findViewById(R.id.txt_jmh_pesanan);
        txt_total_harga = findViewById(R.id.txt_total_harga);
        btn_kurang = findViewById(R.id.btn_kurang);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_pesan = findViewById(R.id.btn_pesan);
        nama_wisata = getIntent().getStringExtra("nama");
        txt_nama_wisata.setText(nama_wisata);
        edt_kode_promo = findViewById(R.id.edt_kode_promo);
        img_tempat = findViewById(R.id.img_tempat);
        path = getIntent().getStringExtra("gambar");
        Picasso.with(PaymentActivity.this).load(path).into(img_tempat);
    }
}
