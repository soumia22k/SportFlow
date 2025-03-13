package com.example.sportflow.Model;

public class entraineur extends user {

    private int idEntraineur;
    private String nom;
    private String specialite;

public entraineur(){}

    
    public entraineur(int idEntraineur, String nom, String specialite) {
        this.idEntraineur = idEntraineur;
        this.nom = nom;
        this.specialite = specialite;
    }

    public int getIdEntraineur() {
        return idEntraineur;
    }

    public void setIdEntraineur(int idEntraineur) {
        this.idEntraineur = idEntraineur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

