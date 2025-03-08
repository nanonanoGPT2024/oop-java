package com.nanonano.entity;

public class Mahasiswa {
    

    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }


    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama + " Nim : " + nim + "Ipk ; " + ipk);
    }
    
}
