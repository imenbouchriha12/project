package projet.example.demo.models;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name="Recruteur")
public class RecruteurModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recruteur;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String secteur;
    private String tel;
    @Column(columnDefinition="MEDIUMTEXT")
    private String photoBase64;
    private byte[] photo;
    private String descPhoto;
    @Temporal(TemporalType.DATE)
    private Date date_naissance= new Date();
    private String description;
    private String entreprise;
    @Temporal(TemporalType.DATE)
    private Date date_inscri= new Date(); 


    public RecruteurModel() {
    }

    public Long getId_recruteur() {
        return this.id_recruteur;
    }

    public void setId_recruteur(Long id_recruteur) {
        this.id_recruteur = id_recruteur;
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

    public String getSecteur() {
        return this.secteur;
    }

    public void setSecteur(String Secteur) {
        this.secteur = Secteur;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public byte[] getPhoto() {
        return this.photo;
    }

    public void setPhoto( byte[] photo) {
        this.photo = photo;
    }

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntreprise() {
        return this.entreprise;
    }

    public void setEntreprise(String Entreprise) {
        this.entreprise = Entreprise;
    }

    public Date getDate_inscri() {
        return this.date_inscri;
    }

    public void setDate_inscrit(Date date_inscrit) {
        this.date_inscri = date_inscrit;
    }
 public String getPhotoBase64() {
        return photoBase64;
    }

    public void setPhotoBase64(String photoBase64) {
        this.photoBase64 = photoBase64;
    }

        public String getDescPhoto() {
        return descPhoto;
    }

    public void setDescPhoto(String descPhoto) {
        this.descPhoto = descPhoto;
    }

}