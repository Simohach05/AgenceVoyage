package com.agencevoyage.repository;

import com.agencevoyage.model.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository <Passager, Long> {
}
