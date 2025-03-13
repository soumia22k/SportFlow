package com.example.sportflow.Model;

import java.util.Date;

public class seance {
    private int idEntraineur;
    private int idMember;

    private Date dateHeure;

    private int idSeance;


    public seance() {
    }

    public seance(int idEntraineur, int idMember, Date dateHeure, int idSeance) {
        this.idEntraineur = idEntraineur;
        this.idMember = idMember;
        this.dateHeure = dateHeure;
        this.idSeance = idSeance;
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

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }
}
