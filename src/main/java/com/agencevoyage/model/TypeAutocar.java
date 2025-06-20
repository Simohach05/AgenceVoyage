package com.agencevoyage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "types_autocar")
public class TypeAutocar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypeAutocar;

    @Column(nullable = false, unique= true)
    private String libelle;
    private String description;
    @Column(nullable= false)
    private int capiciteMax;

    public Long getIdTypeAutocar() {
        return idTypeAutocar;
    }

    public void setIdTypeAutocar(Long idTypeAutocar) {
        this.idTypeAutocar = idTypeAutocar;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapiciteMax() {
        return capiciteMax;
    }

    public void setCapiciteMax(int capiciteMax) {
        this.capiciteMax = capiciteMax;
    }
}
