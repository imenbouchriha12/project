package com.project.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Condidature")
public class CondidatureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Condidature;
    private Date date;
    private int Statut;
    private blob Cv;


    public CondidatureModel() {
    }


    public int getId_Condidature() {
        return this.id_Condidature;
    }

    public void setId_Condidature(int id_Condidature) {
        this.id_Condidature = id_Condidature;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatut() {
        return this.Statut;
    }

    public void setStatut(int Statut) {
        this.Statut = Statut;
    }

    public blob getCv() {
        return this.Cv;
    }

    public void setCv(blob Cv) {
        this.Cv = Cv;
    }
    


}