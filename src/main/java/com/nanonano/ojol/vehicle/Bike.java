package com.nanonano.ojol.vehicle;

public class Bike extends Vehicle{

    public Bike() {
        super("Motor", 3000);
    }

    @Override
    public void bookRide(double distance) {
        System.out.println("Motor di pesan untuk jarak " + distance + " km");
        System.out.println("Total biaya Rp " + calculateFare(distance));
    }
}


/* 
 * 
 *  untuk mobil tarifnya 5000 perkm dan motor tarifnya 3000 per km
 *  keduanya menggunakan methode bookRide untuk menampilkan biaya perjalanan
 * 
 */
