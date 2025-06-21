package com.agencevoyage.model;


import jakarta.persistence.*;

@Entity
@Table(name= "programmations_points_depart")
@IdClass(ProgrammationPointDepart.class)
public class ProgrammationPointDepart {
    @Id
    private Long idProgrammation;
    @Id
    private Long idPointDepart;

    public Long getIdProgrammation() {
        return idProgrammation;
    }

    public void setIdProgrammation(Long idProgrammation) {
        this.idProgrammation = idProgrammation;
    }

    public Long getIdPointDepart() {
        return idPointDepart;
    }

    public void setIdPointDepart(Long idPointDepart) {
        this.idPointDepart = idPointDepart;
    }
}
