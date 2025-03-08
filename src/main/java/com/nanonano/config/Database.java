package com.nanonano.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    private static final String URL = "jdbc:mysql://180.178.102.181:3306/mini_payroll";
    private static final String USER = "root";
    private static final String PASSWORD = "dev@dika";


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
            return null;
        }
    }
}
