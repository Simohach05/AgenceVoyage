package com.agencevoyage.model;

import jakarta.persistence.*;

@Entity
@Table(name="points_depart")
public class PointDepart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPointDepart;
    private String adresse;
    private Long idVille;

    public Long getIdPointDepart() {
        return idPointDepart;
    }

    public void setIdPointDepart(Long idPointDepart) {
        this.idPointDepart = idPointDepart;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getIdVille() {
        return idVille;
    }

    public void setIdVille(Long idVille) {
        this.idVille = idVille;
    }
}
