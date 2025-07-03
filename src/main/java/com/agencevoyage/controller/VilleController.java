package com.agencevoyage.controller;
import com.agencevoyage.model.Ville;
import com.agencevoyage.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/villes")
    @CrossOrigin(origins = "*")
    public class VilleController {

        @Autowired
        private VilleService villeService;

        @PostMapping
        public Ville createVille(@RequestBody Ville ville) {
            return villeService.saveVille(ville);
        }

        @GetMapping
        public List<Ville> getAllVilles() {
            return villeService.getAllVilles();
        }

        @GetMapping("/{id}")
        public Ville getVilleById(@PathVariable Long id) {
            return villeService.getVilleById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteVille(@PathVariable Long id) {
            villeService.deleteVille(id);
        }
    }


