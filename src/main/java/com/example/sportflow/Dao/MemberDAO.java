package com.example.sportflow.Dao;
import java.sql.*;
import com.example.sportflow.Model.member;

public class MemberDAO {
    private Connection connection;

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
}
