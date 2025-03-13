package com.example.sportflow.Model;

public class user {
    private String nom;
    private String password;
    private int idUser;

    public user(String nom, String password, int idUser) {
        this.nom = nom;
        this.password = password;
        this.idUser = idUser;
    }

    public user() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }




}
