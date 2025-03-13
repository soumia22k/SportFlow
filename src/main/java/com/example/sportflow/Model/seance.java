package com.example.sportflow.Model;

public class seance {
    private int idEntraineur;
    private int idMember;
    private String date;
    private String heure;


    public seance(int idEntraineur, int idMember, String date, String heure) {
        this.idEntraineur = idEntraineur;
        this.idMember = idMember;
        this.date = date;
        this.heure = heure;
    }

    public seance() {
    }

    public int getIdEntraineur() {
        return idEntraineur;
    }

    public void setIdEntraineur(int idEntraineur) {
        this.idEntraineur = idEntraineur;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }
}
