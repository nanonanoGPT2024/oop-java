package com.nanonano.ojol.vehicle;

public abstract class Vehicle {

    protected String name;
    protected double ratePerKm;


    public Vehicle(String name, double ratePerKm){
        this.name = name;
        this.ratePerKm = ratePerKm;
    }

    public abstract void bookRide(double distance);
    
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

}

/*
 *  fungsinya 
 *  sebagai class dasar  untuk mobil dan motor
 *  memiliki attribut nama kendaraan dan tarif perKm
 *  method calculateFare digunakan untuk menghitung biaya perjalanan
 * 
 */
