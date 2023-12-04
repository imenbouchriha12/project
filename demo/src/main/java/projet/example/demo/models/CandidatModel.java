package projet.example.demo.models;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Candidat")
public class CandidatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_condidat;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private Long tel;
    private String secteur;
     @Temporal(TemporalType.DATE)
    private Date date_naissance = new Date(); 
    private String Description;
    private String photoBase64;
    private byte[] photo;



    public String getPhotoBase64() {
        return photoBase64;
    }

    public void setPhotoBase64(String photoBase64) {
        this.photoBase64 = photoBase64;
    }

    

    public CandidatModel() {
    }

    public Long getId_condidat() {
        return this.id_condidat;
    }

    public void setId_condidat(Long id_condidat) {
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

    public Long getTel() {
        return this.tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getSecteur() {
        return this.secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public Date getDate_naissence() {
        return this.date_naissance;
    }

    public void setDate_naissence(Date date_naissance) {
        this.date_naissance = date_naissance;
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
