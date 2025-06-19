package com.agencevoyage.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDateTime dateReservation;
    private Boolean assuranceAnnulation;
    private Boolean chambreSupplementaire;

    private Long idClient;
    private Long idProgrammation;

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Boolean getAssuranceAnnulation() {
        return assuranceAnnulation;
    }

    public void setAssuranceAnnulation(Boolean assuranceAnnulation) {
        this.assuranceAnnulation = assuranceAnnulation;
    }

    public Boolean getChambreSupplementaire() {
        return chambreSupplementaire;
    }

    public void setChambreSupplementaire(Boolean chambreSupplementaire) {
        this.chambreSupplementaire = chambreSupplementaire;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdProgrammation() {
        return idProgrammation;
    }

    public void setIdProgrammation(Long idProgrammation) {
        this.idProgrammation = idProgrammation;
    }
}
