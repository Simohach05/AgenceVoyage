package com.agencevoyage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autocars")
public class Autocar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutocar;

    @Column(nullable = false, unique = true)
    private String immatriculation;

    @Column(nullable = false)
    private int nombrePlaces;

    @Column(nullable = false)
    private Long idTypeAutocar; // FK vers TypeAutocar

    // Getters & Setters

    public Long getIdAutocar() {
        return idAutocar;
    }

    public void setIdAutocar(Long idAutocar) {
        this.idAutocar = idAutocar;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public Long getIdTypeAutocar() {
        return idTypeAutocar;
    }

    public void setIdTypeAutocar(Long idTypeAutocar) {
        this.idTypeAutocar = idTypeAutocar;
    }
}
