package com.nanonano.ojol.vehicle;

public class Car extends Vehicle {
    

    public Car() {
        super("Mobil", 5000);
    }

    @Override
    public void bookRide(double distance) {
        System.out.println("Mobil dipesan untuk jarak " + distance + " km");
        System.out.println("Total Biaya Rp " + calculateFare(distance));
    }
}
