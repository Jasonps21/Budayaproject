package com.example.jason.budayaproject;

/**
 * Created by Jason on 21/04/2018.
 */

public class wisata {
    private String nama;
    private String id_wisata;
    private String alamat;
    private String harga;
    private String gambar;
    private String deskripsi;

    public wisata(String id_wisata, String nama, String alamat, String harga, String gambar, String deskripsi) {
        this.id_wisata = id_wisata;
        this.nama = nama;
        this.alamat = alamat;
        this.harga = harga;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public String getId_wisata() {
        return id_wisata;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId_wisata(String id_wisata) {
        this.id_wisata = id_wisata;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
