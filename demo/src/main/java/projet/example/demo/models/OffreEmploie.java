package com.project.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Offre_emploie")
public class Offre_emploieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_offre;
    private String titre;
    private double description;
    private date date_expiration;
    private String lieu;
    private  String nom_societe;
    private int nbr_max_condidat;
    private int nbr__post;
    private String niveau_etude;
    private int etat;

    public Offre_emploieModel() {
    }

    public int getId_offre() {
        return this.id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getDescription() {
        return this.description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public date getDate_expiration() {
        return this.date_expiration;
    }

    public void setDate_expiration(date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public String getLieu() {
        return this.lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNom_societe() {
        return this.nom_societe;
    }

    public void setNom_societe(String nom_societe) {
        this.nom_societe = nom_societe;
    }

    public int getNbr_max_condidat() {
        return this.nbr_max_condidat;
    }

    public void setNbr_max_condidat(int nbr_max_condidat) {
        this.nbr_max_condidat = nbr_max_condidat;
    }

    public int getNbr__post() {
        return this.nbr__post;
    }

    public void setNbr__post(int nbr__post) {
        this.nbr__post = nbr__post;
    }

    public String getNiveau_etude() {
        return this.niveau_etude;
    }

    public void setNiveau_etude(String niveau_etude) {
        this.niveau_etude = niveau_etude;
    }

    public int getEtat() {
        return this.etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }


}