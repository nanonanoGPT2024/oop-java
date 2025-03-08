package com.nanonano.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nanonano.config.Database;
import com.nanonano.entity.Mahasiswa;

public class MahasiswaDAO {

    public static void tambahMahasiswa(Mahasiswa m) {
        String query = "INSERT INTO mahasiswa (nama, nim, ipk) values (?,?,?)";

        try (Connection conn = Database.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, m.getNama());
            stmt.setString(2, m.getNim());
            stmt.setDouble(3, m.getIpk());
            stmt.executeUpdate();
            System.out.println("Mahsiswa Berhasil di tambahkan");

        } catch (Exception e) {
            System.out.println("Gagal Menambahkan Mahasiswa : " + e.getMessage());
        }
    }

    public static List<Mahasiswa> getMahasiswa() {

        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String query = "select * from mahasiswa";
        try (Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
                    while(rs.next()){
                        daftarMahasiswa.add(new Mahasiswa(rs.getString("nama"), rs.getString("nim"), rs.getDouble("ipk")));
                    }

        } catch (Exception e) {
            System.out.println("Gagal mengambil data : " + e.getMessage());
        }

        return daftarMahasiswa;

    }

    public static void hapusMahasiswa(String nim) {
        String query = "DELETE FROM mahasiswa WHERE nim = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nim);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Mahasiswa berhasil dihapus.");
            } else {
                System.out.println("Mahasiswa tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghapus mahasiswa: " + e.getMessage());
        }
    }
}
