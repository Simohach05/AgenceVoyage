package com.agencevoyage.repository;
import com.agencevoyage.model.Ville;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {

}
