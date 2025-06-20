package com.agencevoyage.service;


import com.agencevoyage.model.Emplacement;
import com.agencevoyage.repository.EmplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplacementService {
    @Autowired
    EmplacementRepository emplacementRepository;
    public List<Emplacement> getAll(){
        return emplacementRepository.findAll();
    }
    public Optional<Emplacement> getById(Long id){
        return emplacementRepository.findById(id);
    }
    public Emplacement save(Emplacement emplacement) {
        return emplacementRepository.save(emplacement);
    }
    public void delete(Long id){
        emplacementRepository.deleteById(id);
    }
}
