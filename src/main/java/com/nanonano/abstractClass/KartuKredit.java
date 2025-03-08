package com.nanonano.abstractClass;

public class KartuKredit extends Pembayaran implements BiayaAdmin {

    private String nomorKartu;

    public KartuKredit(double jumlah, String nomorKartu) {
        super(jumlah);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void validasiPembayaran() {
        System.out.println("Validasi kartu kredit : " + nomorKartu);
        if (nomorKartu.length() != 16) {
            throw new IllegalArgumentException("Nomor kartu Tidak Valid");
        }
    }

    @Override
    public void prosesPembayaran() {
        double total = jumlah + hitungBiayaAdmin();
        System.out.println("Memproses pembayaran kartu kredit sebesar Rp " + total);

    }

    @Override
    public double hitungBiayaAdmin() {
        return jumlah * 0.02;
    }
}
