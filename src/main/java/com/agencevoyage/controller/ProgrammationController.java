package com.agencevoyage.controller;


import com.agencevoyage.model.Programmation;
import com.agencevoyage.service.ProgrammationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
;

@RestController
@RequestMapping("/api/programmations")
public class ProgrammationController {

    @Autowired
    private ProgrammationService programmationService;

    @GetMapping
    public List<Programmation> getAll() {
        return programmationService.getAllProgrammations();
    }

    @GetMapping("/{id}")
    public Optional<Programmation> getById(@PathVariable Long id){
        return programmationService.getProgrammationById(id);
    }
    @PostMapping
    public Programmation createProgrammation(@RequestBody Programmation p){
        return programmationService.saveProgrammation(p);
    }

    @PutMapping("/{id}")
    public Programmation updateProgrammation(@PathVariable Long id, @RequestBody Programmation p){
        p.setIdProgrammation(id);
        return programmationService.saveProgrammation(p);

    }
    @DeleteMapping("/{id}")
    public void deleteProgramamtion(@PathVariable Long id){
        programmationService.deleteProgrammation(id);
    }

}
