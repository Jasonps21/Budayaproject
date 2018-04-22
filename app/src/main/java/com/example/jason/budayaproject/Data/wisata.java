package com.example.jason.budayaproject.Data;

/**
 * Created by Jason on 21/04/2018.
 */

public class wisata {
    private String nama;
    private String id_wisata;
    private String alamat;
    private String harga;
    private String image;
    private String deskripsi;

    public wisata(){

    }

    public wisata(String id_wisata, String nama, String alamat, String harga, String image, String deskripsi) {
        this.id_wisata = id_wisata;
        this.nama = nama;
        this.alamat = alamat;
        this.harga = harga;
        this.image = image;
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

    public String getImage() {
        return image;
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

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
