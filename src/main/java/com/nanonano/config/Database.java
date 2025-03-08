package com.nanonano.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    


    private static final Dotenv dotenv = Dotenv.load(); // Muat variabel lingkungan dari .env
    private static final String URL = dotenv.get("DB_URL"); // Ambil URL dari .env
    private static final String USER = dotenv.get("DB_USER"); // Ambil USER dari .env
    private static final String PASSWORD = dotenv.get("DB_PASSWORD"); 


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
            return null;
        }
    }
}
