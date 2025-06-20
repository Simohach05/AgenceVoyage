package com.agencevoyage.model;

import jakarta.persistence.*;

@Entity
@Table(name="autocars_programmations")
@IdClass(AutocarProgrammation.class)
public class AutocarProgrammation {
    @Id
    private Long idAutocar;

    @Id
    private Long idProgrammation;

    public Long getIdAutocar() {
        return idAutocar;
    }

    public void setIdAutocar(Long idAutocar) {
        this.idAutocar = idAutocar;
    }

    public Long getIdProgrammation() {
        return idProgrammation;
    }

    public void setIdProgrammation(Long idProgrammation) {
        this.idProgrammation = idProgrammation;
    }
}
