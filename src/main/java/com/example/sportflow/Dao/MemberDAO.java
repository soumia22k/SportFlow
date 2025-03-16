package com.example.sportflow.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.sportflow.Model.member;

public class MemberDAO {
    private static Connection connection;

    public MemberDAO(Connection connection) {
        this.connection = connection;
    }

    public void addMember(member m) throws SQLException {
        String query = "INSERT INTO members (id, nom, dateNaissance, sportPratique) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, m.getIdMember());
        stmt.setString(2, m.getNom());
        stmt.setString(3, m.getDateNaissance());
        stmt.setString(4, m.getSportPratique());
        stmt.executeUpdate();
    }

    public List<member> getAllMembers() throws SQLException {
        List<member> list = new ArrayList<>();
        String query = "SELECT * FROM member";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            list.add(new member(rs.getInt("idMember"), rs.getString("nom"), rs.getString("dateNaissance"),rs.getString("sportPratique")));
        }
        return list;
    }

    public void updateMember(member e) throws SQLException {
        String query = "UPDATE member SET nom = ?, dateNaissance = ? , sportPratique =? WHERE idMember = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, e.getIdMember());
        stmt.setString(2, e.getNom());
        stmt.setString(3, e.getDateNaissance());
        stmt.setString(4, e.getSportPratique());
        stmt.executeUpdate();
    }

    public static void supprimerMember(int idMember) throws SQLException {
        String query = "DELETE FROM member WHERE idMember = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, idMember);
        stmt.executeUpdate();
    }

}
