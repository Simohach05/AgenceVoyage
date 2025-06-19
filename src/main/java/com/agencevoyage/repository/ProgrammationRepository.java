package com.agencevoyage.repository;

import com.agencevoyage.model.Programmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammationRepository extends JpaRepository<Programmation, Long> {
}
