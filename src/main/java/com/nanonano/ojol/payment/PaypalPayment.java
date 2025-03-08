package com.nanonano.ojol.payment;

public class PaypalPayment implements PayementMethod {
    
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran Rp " + amount + " dilakukan dengan payapll");
    }
}
