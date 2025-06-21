package com.agencevoyage.repository;

import com.agencevoyage.model.AutocarProgrammation;
import com.agencevoyage.model.AutocarProgrammationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutocarProgrammationRepository extends JpaRepository<AutocarProgrammation, AutocarProgrammationId> {
}
