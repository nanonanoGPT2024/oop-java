package com.nanonano;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nanonano.crudLokal.Crud;
import com.nanonano.dao.MahasiswaDAO;
import com.nanonano.entity.Mahasiswa;
import com.nanonano.model.encapsulation.Motor;
import com.nanonano.model.inheritence.Kucing;
import com.nanonano.model.membuat_kelas.Mobile;
import com.nanonano.model.polimorfisme.overiding.Matematika;
import com.nanonano.model.polimorfisme.overloading.Anak;
import com.nanonano.model.polimorfisme.overloading.Ayah;

public class App {
    public static void main(String[] args) {

        // // membuat object dari class mobile
        // Mobile m1 = new Mobile();
        // m1.setMerk("Toypta");
        // m1.setTahun(2022);
        // System.out.println(" belajar membuat class");
        // System.out.println(m1.getMerk());
        // System.out.println(m1.getTahun());
        // System.out.println();

        // // encapsulation
        // Motor m2 = new Motor();
        // m2.setMerk("Honda"); // mengatur nilai
        // System.out.println("belajar encapsulation");
        // System.out.println(m2.getMerk());
        // System.out.println();

        // // inheritence
        // Kucing k1 = new Kucing();
        // k1.setNama("kucing garong");
        // System.out.println("inheritence");
        // System.out.println("**********");
        // k1.makan();
        // k1.suara();
        // System.out.println("***********");

        // // polimorfisme orverloading
        // Matematika mat = new Matematika();

        // System.out.println("polimorfisme overloading");
        // System.out.println("******************");
        // System.out.println(mat.tambah(5, 10));
        // System.out.println(mat.tambah(5.6, 10.4));
        // System.out.println("******************");

        // // // polimorfisme overidding
        // Ayah ay = new Ayah();
        // ay.pesan();

        // Anak an = new Anak();
        // an.pesan();

        // membuat aplikasi console

        Scanner scanner = new Scanner(System.in);
        // baca data dari memory temporary 
        // ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // baca dari file 
        // ArrayList<Mahasiswa> daftarMahasiswa = Crud.bacaData();

        while (true) {
            System.out.println("\n ======== Menu ========== ");
            System.out.println("1. Tambah Mahsasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan NIM : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukan IPK : ");
                    double ipk = scanner.nextDouble();

                    // Mahasiswa mhs = new Mahasiswa(nama, nim, ipk);
                    // simpan ke memory temporary
                    // daftarMahasiswa.add(mhs);

                    // simpan ke file 
                    // daftarMahasiswa.add(new Mahasiswa(nama, nim, ipk));
                    // Crud.simpanData(daftarMahasiswa);


                    // simpan ke database
                    MahasiswaDAO.tambahMahasiswa(new Mahasiswa(nama, nim, ipk));
                    System.out.println("Mahasiswa Berhasil di tambahkan");
                    break;

                case 2:
                    List<Mahasiswa> daftarMahasiswa = MahasiswaDAO.getMahasiswa();
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada mahasiswa yg terdaftar. ");
                    } else {
                        for (Mahasiswa m : daftarMahasiswa) {
                            m.tampilkanInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Masukan NIM mahasiswa yang ingin anda hapus : ");
                    String nimHapus = scanner.nextLine();

                    boolean ditemukan = false;
                //    baca dari file
                    // for (Mahasiswa m: daftarMahasiswa) {
                    //     if(m.getNim().equals(nimHapus)) {
                    //         daftarMahasiswa.remove(m);
                    //         System.out.println("Mahasiswa degan NIM : " + nimHapus + " Berhasil di hapus.");
                    //         ditemukan = true;
                    //         break;
                    //     }
                    // }

                    // akses dari db 
                    MahasiswaDAO.hapusMahasiswa(nimHapus);

                    // if(!ditemukan) {
                    //     System.out.println("Mahasiswa dengan nim : " +nimHapus+ " tidak di temukan");
                    // }

                    break;
                case 4:
                    System.out.println("Program Selesai : ");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan Tidak Valid..");
            }
        }
    }
}
