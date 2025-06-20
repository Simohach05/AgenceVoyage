package com.agencevoyage.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "passagers")
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPassager;

    private String nom;
    private String prenom;
    private java.time.LocalDate dateNaissance;
    private Long idReservation; // FK vers Reservation
    private Long idEmplacement; //FK vers Emplacement

    public Long getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(Long idPassager) {
        this.idPassager = idPassager;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Long getIdEmplacement() {
        return idEmplacement;
    }

    public void setIdEmplacement(Long idEmplacement) {
        this.idEmplacement = idEmplacement;
    }
}
