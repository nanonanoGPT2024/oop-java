package com.nanonano.model.polimorfisme.overiding;


// polimorfisme (banyak bentuk)
// method overiding adalah method lebih dari 1 dengan nama yg sama dalam satu class tapi beda type data
public class Matematika {
    
    public int tambah(int a, int b){
        return a + b;
    }


    public double tambah(double a, double b) {
        return a + b;
    }
}
