package com.example.sportflow.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sportflow.Model.entraineur;

public class EntraineurDAO {
    private static Connection connection;

    public EntraineurDAO() {
        this.connection = connection;
    }


    public void addEntraineur(entraineur e) throws SQLException {
        String query = "INSERT INTO entraineur (idEntraineur, nom, specialite) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, e.getIdEntraineur());
        stmt.setString(2, e.getNom());
        stmt.setString(3, e.getSpecialite());
        stmt.executeUpdate();
    }


    public List<entraineur> getAllEntraineurs() throws SQLException {
        List<entraineur> list = new ArrayList<>();
        String query = "SELECT * FROM entraineur";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            list.add(new entraineur(rs.getInt("idEntraineur"), rs.getString("nom"), rs.getString("specialite")));
        }
        return list;
    }

    public void updateEntraineur(entraineur e) throws SQLException {
        String query = "UPDATE entraineur SET nom = ?, specialite = ? WHERE idEntraineur = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, e.getNom());
        stmt.setString(2, e.getSpecialite());
        stmt.setInt(3, e.getIdEntraineur());
        stmt.executeUpdate();
    }

    public static void supprimerEntraineur(int idEntraineur) throws SQLException {
        String query = "DELETE FROM entraineur WHERE idEntraineur = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, idEntraineur);
        stmt.executeUpdate();
    }
}


