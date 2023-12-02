package projet.example.demo.models;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Candidat")
public class CandidatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_condidat;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private int tel;
    private String secteur;
    private Date date_naissence;
    private String Description;
    private byte[] photo;
    

    public CandidatModel() {
    }

    public int getId_condidat() {
        return this.id_condidat;
    }

    public void setId_condidat(int id_condidat) {
        this.id_condidat = id_condidat;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getSecteur() {
        return this.secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public Date getDate_naissence() {
        return this.date_naissence;
    }

    public void setDate_naissence(Date date_naissence) {
        this.date_naissence = date_naissence;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getPhoto() {
        return this.photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }


    
}
