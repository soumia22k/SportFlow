package com.example.sportflow.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportflow", "root", "");

        Statement statement = connection.createStatement();

        String Membretable = "CREATE TABLE IF NOT EXISTS member(" +
                "idMrmber INT PRIMARY KEY AUTO_INCREMENT," +
                "nom VARCHAR(100)," +
                "datdeNaissance DATE(20)," +
                "sportPratique VARCHAR(50))";
        statement.execute(Membretable);

        String Entraineurtable = "CREATE TABLE IF NOT EXISTS entraineur("+
                "idEntraineur INT PRIMARY KEY AUTO_INCREMENT," +
                "nom VARCHAR (20)"+
                "specialite VARCHAR(60))";
        statement.execute(Entraineurtable);

        String Seancetable="CREATE TABLE IF NOT EXISTS seance("+
                "idseance INT PRIMARY KEY AUTO_INCREMENT,"+
                "idMember INT (10)"+
                "idEntraneur INT (10)"+
                "dateHeure DATETIME (90)"+
                "FOREIGN KEY (idMember) REFERENCES member(id) "+
                "FOREIGN KEY (idEntraneur) REFERENCES entraineur(id) )";
        statement.execute(Seancetable);

        String usertable="CREATE TABLE IF NOT EXISTS users("+
                "idUser INT PRIMARY KEY AUTO_INCREMENT,"+
                "nom STRING VARCHARE(70)"+
                "password VARCHAR(255))";
        statement.execute(usertable);
        return connection;
    }
}
