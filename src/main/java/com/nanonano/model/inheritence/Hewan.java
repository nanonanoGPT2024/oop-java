package com.nanonano.model.inheritence;


public class Hewan {
    String nama;

    public void makan() {
        System.out.println(nama + " Sedang makan ");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
