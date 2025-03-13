package com.example.sportflow.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sportflow.Model.entraineur;

public class EntraineurDAO {
    private Connection connection;

    public EntraineurDAO() {
        this.connection = connection;
    }




    public void addEntraineur(entraineur e) throws SQLException {
        String query = "INSERT INTO entraineurs (id, nom, specialite) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, e.getIdEntraineur());
        stmt.setString(2, e.getNom());
        stmt.setString(3, e.getSpecialite());
        stmt.executeUpdate();
    }


    public List<entraineur> getAllEntraineurs() throws SQLException {
        List<entraineur> list = new ArrayList<>();
        String query = "SELECT * FROM entraineurs";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            list.add(new entraineur(rs.getInt("id"), rs.getString("nom"), rs.getString("specialite")));
        }
        return list;
    }

    public void updateEntraineur(entraineur e) throws SQLException {
        String query = "UPDATE entraineurs SET nom = ?, specialite = ? WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, e.getNom());
        stmt.setString(2, e.getSpecialite());
        stmt.setInt(3, e.getIdEntraineur());
        stmt.executeUpdate();
    }

    public void deleteEntraineur(int id) throws SQLException {
        String query = "DELETE FROM entraineurs WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}


