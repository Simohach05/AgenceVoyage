package com.agencevoyage.controller;


import com.agencevoyage.model.Passager;
import com.agencevoyage.service.PassagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/passagers")
public class PassagerController {
    @Autowired
    private PassagerService passagerService;
    @GetMapping
    public List<Passager> getAll(){
        return passagerService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Passager> getById(@PathVariable Long id){
        return passagerService.getById(id);
    }
    @PostMapping
    public Passager create(@RequestBody Passager passager){
        return passagerService.save(passager);
    }
    @PutMapping("/{id}")
    public Passager update(@PathVariable Long id, @RequestBody Passager passager){
        passager.setIdPassager(id);
        return passagerService.save(passager);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        passagerService.delete(id);
    }
}
