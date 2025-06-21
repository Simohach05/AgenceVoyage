package com.agencevoyage.model;

import java.io.Serializable;
import java.util.Objects;

public class AutocarProgrammationId implements Serializable {
    private Long idAutocar;
    private Long idProgrammation;

    public AutocarProgrammationId(Long idAutocar, Long idProgrammation) {
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AutocarProgrammationId that)) return false;
        return Objects.equals(idAutocar, that.idAutocar) && Objects.equals(idProgrammation, that.idProgrammation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutocar, idProgrammation);
    }
}
