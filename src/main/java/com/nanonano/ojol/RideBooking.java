package com.nanonano.ojol;

import com.nanonano.ojol.payment.PayementMethod;
import com.nanonano.ojol.vehicle.Vehicle;

public class RideBooking {
    
    private Vehicle vehicle;
    private PayementMethod paymentMethod;


    public RideBooking(Vehicle vehicle, PayementMethod paymentMethod) {
        this.vehicle = vehicle;
        this.paymentMethod = paymentMethod;
    }

    public void bookAndPay(double distance) {
        vehicle.bookRide(distance);
        double fare = vehicle.calculateFare(distance);
        paymentMethod.pay(fare);
    }
}


/*
 * 
 * fungsinya 
 * mengautr kendaraan danmethode pembyaran
 * memanggil book Ride dari kendaraan dan pay() dari mthode pambayaran\
 * 
 * 
 */

