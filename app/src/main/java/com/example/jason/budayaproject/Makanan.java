package com.example.jason.budayaproject;

/**
 * Created by Jason on 21/04/2018.
 */

public class Makanan {
    private String nama, id_makanan, harga, image, alamat, deskripsi;

    public Makanan() {

    }

    public Makanan(String nama, String id_makanan, String harga, String image, String alamat, String deskripsi) {
        this.nama = nama;
        this.id_makanan = id_makanan;
        this.harga = harga;
        this.image = image;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(String id_makanan) {
        this.id_makanan = id_makanan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
