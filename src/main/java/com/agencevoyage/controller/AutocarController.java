package com.agencevoyage.controller;

import com.agencevoyage.model.Autocar;
import com.agencevoyage.service.AutocarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autocars")
public class AutocarController {

    @Autowired
    private AutocarService service;

    @GetMapping
    public List<Autocar> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Autocar> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Autocar create(@RequestBody Autocar autocar) {
        return service.save(autocar);
    }

    @PutMapping("/{id}")
    public Autocar update(@PathVariable Long id, @RequestBody Autocar autocar) {
        autocar.setIdAutocar(id);
        return service.save(autocar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
