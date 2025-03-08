package com.nanonano;

import com.nanonano.abstractClass.KartuKredit;
import com.nanonano.abstractClass.Pembayaran;
import com.nanonano.abstractClass.TransferBank;


public class MainAbstract {

    public static void main(String[] args) {

        // pembayaran dengan kartu kredit
        Pembayaran pembayaran1 = new KartuKredit(1000000, "1234567812345678");
        pembayaran1.validasiPembayaran();
        pembayaran1.prosesPembayaran();


        //  pembayaran dengan transfer bank
        Pembayaran pembayaranBank = new TransferBank(5000000, "9876543210");
        pembayaranBank.validasiPembayaran();
        pembayaranBank.prosesPembayaran();
    }
}
