package projet.example.demo.models;

import jakarta.persistence.*;

import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name="Condidature")
public class CandidatureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Condidature;
    private Date date;
    private int Statut;
    @Lob
    private byte[] cv;

    public CandidatureModel() {
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

    public byte[] getCv() {
        return this.cv;
    }

    public void setCv(byte[] Cv) {
        this.cv = Cv;
    }
    


}