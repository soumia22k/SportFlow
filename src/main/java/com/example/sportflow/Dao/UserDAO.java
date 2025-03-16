package com.example.sportflow.Dao;
import java.sql.*;
import com.example.sportflow.Model.user;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }



}