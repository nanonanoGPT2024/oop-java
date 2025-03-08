package com.nanonano.ojol.payment;

public interface PayementMethod {
    void pay(double amounts);
}


/*
 *   fungsinya 
 *    sebagai kontrak untuk semuua methode pambayaran
 *    setiap method pembayaran harus mengimplementasikan pay (amout)
 */


