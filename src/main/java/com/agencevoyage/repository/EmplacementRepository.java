package com.agencevoyage.repository;


import com.agencevoyage.model.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmplacementRepository extends JpaRepository<Emplacement, Long> {
}
