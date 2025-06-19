package com.agencevoyage.service;

import com.agencevoyage.model.Programmation;
import com.agencevoyage.repository.ProgrammationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class ProgrammationService {
    @Autowired
    private ProgrammationRepository programmationRepository;

    public List<Programmation> getAllProgrammations(){
        return programmationRepository.findAll();
    }
    public Optional<Programmation> getProgrammationById(Long id){
        return programmationRepository.findById(id);
    }
    public Programmation saveProgrammation(Programmation prog){
        return programmationRepository.save(prog);
    }

    public void deleteProgrammation(Long id){
        programmationRepository.deleteById(id);
    }

}
