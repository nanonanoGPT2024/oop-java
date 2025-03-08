package com.nanonano.ojol.payment;

public class CreditCardPayment implements PayementMethod{
     
    @Override
    public void pay(double amounts) {
        System.out.println("Pembayaran Rp " + amounts + " dilakukan dengan kartu kredit");
    }
}
     