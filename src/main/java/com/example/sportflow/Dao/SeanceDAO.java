package com.example.sportflow.Dao;

import java.sql.*;
import com.example.sportflow.Model.seance;

public class SeanceDAO {
    private Connection connection;

    public SeanceDAO(Connection connection) {
        this.connection = connection;
    }

    public void addSeance(seance s) throws SQLException {
        String query = "INSERT INTO seances (idEntraineur, idMember, date, heure) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, s.getIdEntraineur());
        stmt.setInt(2, s.getIdMember());
        stmt.setString(3, s.getDate());
        stmt.setString(4, s.getHeure());
        stmt.executeUpdate();
    }
}
