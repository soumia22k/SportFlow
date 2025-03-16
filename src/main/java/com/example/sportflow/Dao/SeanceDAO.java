package com.example.sportflow.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sportflow.Model.entraineur;
import com.example.sportflow.Model.member;
import com.example.sportflow.Model.seance;

public class SeanceDAO {
    private static Connection connection;

    public SeanceDAO(Connection connection) {
        this.connection = connection;
    }

    public void addSeance(seance s) throws SQLException {
        String query = "INSERT INTO seances (idESeance,idEntraineur, idMember, dateHeure) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, Integer.parseInt(s.getIdSeance()));
        stmt.setInt(2, Integer.parseInt(s.getIdEntraineur()));
        stmt.setInt(3, Integer.parseInt(s.getIdMember()));
        stmt.setDate(4, (Date) s.getDateHeure());

        stmt.executeUpdate();
    }

    public List<seance> getAllSeances() throws SQLException {
        List<seance> list = new ArrayList<>();
        String query = "SELECT * FROM seance";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            list.add(new seance(rs.getInt("idseance"), rs.getDate("dateHeure"), rs.getInt("idEntraineur"), rs.getInt("idMember")));
        }
        return list;
    }

    public void updateSeance(seance s) throws SQLException {
        String query = "UPDATE seance SET  dateHeure = ?, idMember = ? , idEntraineur =? WHERE idSeance = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setDate(1, (Date) s.getDateHeure());
        stmt.setInt(2, Integer.parseInt(s.getIdEntraineur()));
        stmt.setInt(3, Integer.parseInt(s.getIdMember()));
        stmt.executeUpdate();
    }

    public static void supprimerSeance(int idSeance) throws SQLException {
        String query = "DELETE FROM seance WHERE idseance = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, idSeance);
        stmt.executeUpdate();
    }


}
