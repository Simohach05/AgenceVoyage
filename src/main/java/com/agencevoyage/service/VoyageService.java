package com.agencevoyage.service;
import com.agencevoyage.model.Voyage;
import com.agencevoyage.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VoyageService {

    @Autowired
    private VoyageRepository voyageRepository;
    public List<Voyage> getAllVoyages(){
        return voyageRepository.findAll();
    }
    public Optional<Voyage> getVoyageById(Long id){
        return voyageRepository.findById(id);
    }
    public Voyage saveVoyage(Voyage voyage) {
        return voyageRepository.save(voyage);
    }
    public void deleteVoyage (Long id) {
        voyageRepository.deleteById(id);
    }
}
