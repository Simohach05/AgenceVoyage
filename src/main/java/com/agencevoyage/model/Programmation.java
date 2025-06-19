package com.agencevoyage.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "programmations")
public class Programmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProgrammation;

    private LocalDate dateDepart;
    private LocalDate dateRetour;
    private Double prixBase;

    private Long idVoyage; // FK vers Voyage

    public Long getIdProgrammation() {
        return idProgrammation;
    }

    public void setIdProgrammation(Long idProgrammation) {
        this.idProgrammation = idProgrammation;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Double getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(Double prixBase) {
        this.prixBase = prixBase;
    }

    public Long getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(Long idVoyage) {
        this.idVoyage = idVoyage;
    }
}
