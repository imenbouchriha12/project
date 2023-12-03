package projet.example.demo.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Candidature")
public class CandidatureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_condidature;
    private Date date;
    private int statut;
    private byte[] cv;


    public CandidatureModel() {
    }


    public Long getId_condidature() {
        return this.id_condidature;
    }

    public void setId_Condidature(Long id_Condidature) {
        this.id_condidature = id_Condidature;
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

    public void setStatut(int Statut) {
        this.statut = Statut;
    }

    public byte[] getCv() {
        return this.cv;
    }

    public void setCv(byte[] Cv) {
        this.cv = Cv;
    }
    


}