package com.agencevoyage.service;

import com.agencevoyage.model.Ville;
import com.agencevoyage.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {

    @Autowired
    private VilleRepository villeRepository;

    public Ville saveVille(Ville ville) {
        return villeRepository.save(ville);
    }

    public List<Ville> getAllVilles() {
        return villeRepository.findAll();
    }

    public Ville getVilleById(Long id) {
        return villeRepository.findById(id).orElse(null);
    }

    public void deleteVille(Long id) {
        villeRepository.deleteById(id);
    }
}
