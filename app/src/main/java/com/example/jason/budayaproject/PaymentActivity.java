package com.example.jason.budayaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    TextView txt_nama_wisata = findViewById(R.id.txt_nama_wisata);
    TextView txt_detail_wisata = findViewById(R.id.txt_detail_wisata);
    //TODO: ingat tambah tanggalnya di textnya nanti
    TextView txt_tanggal_expire = findViewById(R.id.txt_tanggal_expire);
    TextView txt_jmh_pesanan = findViewById(R.id.txt_jmh_pesanan);
    TextView txt_total_harga = findViewById(R.id.txt_total_harga);

    Button btn_kurang = findViewById(R.id.btn_kurang);
    Button btn_tambah = findViewById(R.id.btn_tambah);
    Button btn_pesan = findViewById(R.id.btn_pesan);

    EditText edt_kode_promo = findViewById(R.id.edt_kode_promo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }
}
