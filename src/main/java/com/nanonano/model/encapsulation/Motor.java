package com.nanonano.model.encapsulation;

// kita gunakan modifer private agar attribute tidak bisa di akses secara langsung
// simle nya adalah encapsulation  adalah getter dan setter
public class Motor {
    private String merk;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }


}



