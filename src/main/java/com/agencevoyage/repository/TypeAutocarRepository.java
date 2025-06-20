package com.agencevoyage.repository;


import com.agencevoyage.model.TypeAutocar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAutocarRepository extends JpaRepository<TypeAutocar, Long> {
}
