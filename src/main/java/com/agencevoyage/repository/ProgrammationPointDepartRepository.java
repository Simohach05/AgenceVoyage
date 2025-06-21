package com.agencevoyage.repository;

import com.agencevoyage.model.ProgrammationPointDepart;
import com.agencevoyage.model.ProgrammationPointDepartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProgrammationPointDepartRepository extends JpaRepository<ProgrammationPointDepart, ProgrammationPointDepartId> {
}
