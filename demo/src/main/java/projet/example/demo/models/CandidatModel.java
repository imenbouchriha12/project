package projet.example.demo.models;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Candidat")
public class CandidatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidat;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private Long tel;
    private String secteur;
     @Temporal(TemporalType.DATE)
    private Date date_naissance = new Date(); 
     @Temporal(TemporalType.DATE)
    private Date date_inscri = new Date();
    private String Description;
    @Column(columnDefinition="MEDIUMTEXT")
        private String photoBase64;
    private byte[] photo;
    private String descPhoto;

    
 @ManyToOne
    @JoinColumn(name = "condidature_id")
    private CandidatureModel Candidat;

    
    public CandidatModel() {
    }
    

    public Long getId_candidat() {
        return this.id_candidat;
    }

    public void setId_candidat(Long id_candidat) {
        this.id_candidat = id_candidat;
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

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_inscri() {
        return this.date_inscri;
    }

    public void setDate_inscri(Date date_inscri) {
        this.date_inscri = date_inscri;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPhotoBase64() {
        return this.photoBase64;
    }

    public void setPhotoBase64(String photoBase64) {
        this.photoBase64 = photoBase64;
    }

    public byte[] getPhoto() {
        return this.photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getDescPhoto() {
        return this.descPhoto;
    }

    public void setDescPhoto(String descPhoto) {
        this.descPhoto = descPhoto;
    }

    public CandidatureModel getCandidat() {
        return this.Candidat;
    }

    public void setCandidat(CandidatureModel Candidat) {
        this.Candidat = Candidat;
    }
    
 
    
}
