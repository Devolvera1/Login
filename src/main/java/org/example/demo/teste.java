package org.example.demo;
import java.sql.Connection;

public class teste {
    public static void main(String[] args) {
        try (Connection conn = Database.getConnection()) {
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
