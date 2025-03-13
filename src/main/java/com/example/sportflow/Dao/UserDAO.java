package com.example.sportflow.Dao;
import java.sql.*;
import com.example.sportflow.Model.user;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public void addUser(user u) throws SQLException {
        String query =  "SELECT * FROM users WHERE role = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, u.getRole());
        stmt.executeUpdate();
    }
}