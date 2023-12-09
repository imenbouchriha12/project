package projet.example.demo.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OffreEmploie")
public class OffreEmploieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_offre;
    private String titre;
    private String description;
    private Date date_expiration;
    private String lieu;
    private  String nom_societe;
    private int nbr_max_candidat;
    private int nbr__post;
    private String niveau_etude;
    private int etat;

     @ManyToOne
    @JoinColumn(name = "condidature_id")
    private CandidatureModel Candidat;
    


    public OffreEmploieModel() {
    }

 

    public Long getId_offre() {
        return this.id_offre;
    }

    public void setId_offre(Long id_offre) {
        this.id_offre = id_offre;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_expiration() {
        return this.date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
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

    public int getNbr_max_candidat() {
        return this.nbr_max_candidat;
    }

    public void setNbr_max_candidat(int nbr_max_candidat) {
        this.nbr_max_candidat = nbr_max_candidat;
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

    public CandidatureModel getCandidat() {
        return this.Candidat;
    }

    public void setCandidat(CandidatureModel Candidat) {
        this.Candidat = Candidat;
    }



}