package com.agencevoyage.model;


import jakarta.persistence.*;

@Entity
@Table (name = "emplacements")
public class Emplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmplacement;

    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private Long idAutocar;

    public Long getIdEmplacement() {
        return idEmplacement;
    }

    public void setIdEmplacement(Long idEmplacement) {
        this.idEmplacement = idEmplacement;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getIdAutocar() {
        return idAutocar;
    }

    public void setIdAutocar(Long idAutocar) {
        this.idAutocar = idAutocar;
    }
}
