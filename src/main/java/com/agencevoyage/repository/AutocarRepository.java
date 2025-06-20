package com.agencevoyage.repository;

import com.agencevoyage.model.Autocar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutocarRepository extends JpaRepository<Autocar, Long> {
}
