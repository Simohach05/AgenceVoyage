package com.agencevoyage.model;

import java.io.Serializable;
import java.util.Objects;

public class ProgrammationPointDepartId implements Serializable {
    private Long idProgrammation;
    private Long idPointDepart;

    public ProgrammationPointDepartId(Long idProgrammation, Long idPointDepart) {
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProgrammationPointDepartId that)) return false;
        return Objects.equals(idProgrammation, that.idProgrammation) && Objects.equals(idPointDepart, that.idPointDepart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgrammation, idPointDepart);
    }
}
