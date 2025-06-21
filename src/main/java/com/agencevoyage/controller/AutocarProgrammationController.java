package com.agencevoyage.controller;


import com.agencevoyage.model.AutocarProgrammation;
import com.agencevoyage.service.AutocarProgrammationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autocars-programmations")
public class AutocarProgrammationController {
    @Autowired
    AutocarProgrammationService service;
    @GetMapping
    public List<AutocarProgrammation> getAll() { return service.getAll(); }
    @PostMapping
    public AutocarProgrammation create(@RequestBody AutocarProgrammation ap) { return service.save(ap); }
    @DeleteMapping("/{idAutocar}/{idProgrammation}")
    public void delete(@PathVariable Long idAutocar, @PathVariable Long idProgrammation) {
        service.delete(idAutocar, idProgrammation);
    }
}
