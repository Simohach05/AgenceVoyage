package com.agencevoyage.model;

import jakarta.persistence.*;

@Entity
@Table (name = "hotels")
public class Hotel {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idHotel;
 private String adress;
 private int nombreEtoiles;
 private Long idVille;

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNombreEtoiles() {
        return nombreEtoiles;
    }

    public void setNombreEtoiles(int nombreEtoiles) {
        this.nombreEtoiles = nombreEtoiles;
    }

    public Long getIdVille() {
        return idVille;
    }

    public void setIdVille(Long idVille) {
        this.idVille = idVille;
    }
}
