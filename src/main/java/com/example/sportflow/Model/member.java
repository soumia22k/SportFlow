package com.example.sportflow.Model;

public class member extends user {

    private  int idMember;
    private String nom;
    private String dateNaissance;
    private String  sportPratique;


    public member(int idMember, String nom, String dateNaissance, String sportPratique) {
        this.idMember = idMember;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sportPratique = sportPratique;
    }
    public member(){}

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSportPratique() {
        return sportPratique;
    }

    public void setSportPratique(String sportPratique) {
        this.sportPratique = sportPratique;
    }
}
