package projet.example.demo.models;

        import java.sql.Date;

        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;
        import jakarta.persistence.Table;
        import jakarta.persistence.*;
        import java.sql.Date;


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
    private int tel;
    private byte[] photo;
    private Date date_naissence;
    private String description;
    private String Entreprise;
    private Date date_inscrit;


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

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public byte[] getPhoto() {
        return this.photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Date getDate_naissence() {
        return this.date_naissence;
    }

    public void setDate_naissence(Date date_naissence) {
        this.date_naissence = date_naissence;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntreprise() {
        return this.Entreprise;
    }

    public void setEntreprise(String Entreprise) {
        this.Entreprise = Entreprise;
    }

    public Date getDate_inscrit() {
        return this.date_inscrit;
    }

    public void setDate_inscrit(Date date_inscrit) {
        this.date_inscrit = date_inscrit;
    }


}