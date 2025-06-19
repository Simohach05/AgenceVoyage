package com.agencevoyage.controller;

import com.agencevoyage.model.Voyage;
import com.agencevoyage.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/voyages")
public class VoyageController {

    @Autowired
    private VoyageService voyageService;

    @GetMapping
    public List<Voyage> getAllVoyages(){
        return voyageService.getAllVoyages();
    }

    @GetMapping("/{id}")
    public Optional<Voyage> getVoyageById(@PathVariable Long id){
        return voyageService.getVoyageById(id);
    }
    @PostMapping
    public Voyage creatVoyage(@RequestBody Voyage voyage){
        return voyageService.saveVoyage(voyage);
    }

    @PutMapping("/{id}")
    public Voyage updateVoyage(@PathVariable Long id, @RequestBody Voyage updatedVoyage){
        updatedVoyage.setIdVoyage(id);
        return voyageService.saveVoyage(updatedVoyage);
    }
    @DeleteMapping("/{id}")
    public void deleteVoyage(@PathVariable Long id) {
        voyageService.deleteVoyage(id);
    }
}
