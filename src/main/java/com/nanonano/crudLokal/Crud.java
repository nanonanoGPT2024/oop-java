package com.nanonano.crudLokal;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import com.nanonano.entity.Mahasiswa;

public class Crud {

    public static void simpanData(ArrayList<Mahasiswa> daftarMahasiswa) {
        try (
                FileOutputStream fileOut = new FileOutputStream("datamahasiswa.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(daftarMahasiswa);
        } catch (Exception e) {
            System.out.println("Gagal Menyimpan data : " + e.getMessage());

        }
    }

    public static ArrayList<Mahasiswa> bacaData() {
        try (FileInputStream  fileIn = new FileInputStream("datamahasiswa.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (ArrayList<Mahasiswa>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
