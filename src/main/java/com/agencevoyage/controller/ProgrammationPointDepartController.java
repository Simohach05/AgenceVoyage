package com.agencevoyage.controller;


import com.agencevoyage.model.ProgrammationPointDepart;
import com.agencevoyage.service.ProgrammationPointDepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmations-points-depart")
public class ProgrammationPointDepartController {
    @Autowired
    private ProgrammationPointDepartService service;
    @GetMapping
    public List<ProgrammationPointDepart> getAll() { return service.getAll(); }
    @PostMapping
    public ProgrammationPointDepart create(@RequestBody ProgrammationPointDepart p) { return service.save(p); }
    @DeleteMapping("/{idProgrammation}/{idPointDepart}")
    public void delete(@PathVariable Long idProgrammation, @PathVariable Long idPointDepart) {
        service.delete(idProgrammation, idPointDepart);
    }
}
