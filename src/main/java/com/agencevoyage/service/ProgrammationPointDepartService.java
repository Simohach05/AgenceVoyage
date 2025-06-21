package com.agencevoyage.service;

import com.agencevoyage.model.ProgrammationPointDepart;
import com.agencevoyage.model.ProgrammationPointDepartId;
import com.agencevoyage.repository.ProgrammationPointDepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammationPointDepartService {
    @Autowired
    private ProgrammationPointDepartRepository repo;
    public List<ProgrammationPointDepart> getAll() { return repo.findAll(); }
    public ProgrammationPointDepart save(ProgrammationPointDepart p) { return repo.save(p); }
    public void delete(Long idProgrammation, Long idPointDepart) {
        repo.deleteById(new ProgrammationPointDepartId(idProgrammation, idPointDepart));
    }
}
