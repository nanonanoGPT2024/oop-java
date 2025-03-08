package com.nanonano.ojol;

import com.nanonano.ojol.payment.CreditCardPayment;
import com.nanonano.ojol.payment.PayementMethod;
import com.nanonano.ojol.vehicle.Car;
import com.nanonano.ojol.vehicle.Vehicle;

public class MainOjol {
    

    public static void main(String[] args) {
    
        //  simulasi pemesana kendaraan 
        Vehicle car = new Car();
        PayementMethod creditCar = new CreditCardPayment();
        RideBooking booking = new RideBooking(car, creditCar);
        booking.bookAndPay(10);
        System.out.println("--------------------------------");
    }
}
