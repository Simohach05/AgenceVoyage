package com.agencevoyage.controller;


import com.agencevoyage.model.Emplacement;
import com.agencevoyage.service.EmplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emplacements")
public class EmplacementController {
    @Autowired
    private EmplacementService emplacementService;
    @GetMapping
    public List<Emplacement> getAll(){
        return emplacementService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Emplacement>getById(@PathVariable Long id){
        return emplacementService.getById(id);
    }
    @PostMapping
    public Emplacement create(@RequestBody Emplacement emplacement){
        return emplacementService.save(emplacement);
    }
    @PutMapping("/{id}")
    public Emplacement update(@PathVariable Long id, @RequestBody Emplacement emplacement){
        emplacement.setIdEmplacement(id);
        return emplacementService.save(emplacement);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        emplacementService.delete(id);
    }
}
