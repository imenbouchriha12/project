package projet.example.demo.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Candidature")
public class CandidatureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidature;
    private Date date;
    private int statut;
    @Lob
    private byte[] cv;
    private String cvFileName;



    public CandidatureModel() {
    }

    public Long getId_candidature() {
        return this.id_candidature;
    }

    public void setId_candidature(Long id_candidature) {
        this.id_candidature = id_candidature;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatut() {
        return this.statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public byte[] getCv() {
        return this.cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    public String getCvFileName() {
        return this.cvFileName;
    }

    public void setCvFileName(String cvFileName) {
        this.cvFileName = cvFileName;
    }





}