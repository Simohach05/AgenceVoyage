package com.agencevoyage.service;

import com.agencevoyage.model.AutocarProgrammation;
import com.agencevoyage.model.AutocarProgrammationId;
import com.agencevoyage.repository.AutocarProgrammationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutocarProgrammationService {
    @Autowired
    AutocarProgrammationRepository repo;

    public List<AutocarProgrammation> getAll() {
        return repo.findAll();
    }

    public AutocarProgrammation save(AutocarProgrammation ap) {
        return repo.save(ap);
    }

    public void delete(Long idAutocar, Long idProgrammation) {
        repo.deleteById(new AutocarProgrammationId(idAutocar, idProgrammation));
    }
}
