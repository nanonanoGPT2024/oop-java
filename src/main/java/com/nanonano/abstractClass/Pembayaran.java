package com.nanonano.abstractClass;

public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah){
        this.jumlah = jumlah;
    }


    public abstract void validasiPembayaran();
    public abstract void prosesPembayaran();

}
