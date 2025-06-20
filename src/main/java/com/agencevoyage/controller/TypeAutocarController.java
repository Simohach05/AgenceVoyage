package com.agencevoyage.controller;


import com.agencevoyage.model.TypeAutocar;
import com.agencevoyage.service.TypeAutocarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/types_autocar")
public class TypeAutocarController {
    @Autowired
    private TypeAutocarService typeautocarservice;

    @GetMapping
    public List<TypeAutocar> getAll(){
        return typeautocarservice.getAll();
    }
    @GetMapping("/{id}")
    public Optional<TypeAutocar> getById(@PathVariable Long id){
        return typeautocarservice.getById(id);
    }
    @PostMapping
    public TypeAutocar create(@RequestBody TypeAutocar type){
        return typeautocarservice.save(type);
    }
    @PutMapping("/{id}")
    public TypeAutocar update(@PathVariable Long id, @RequestBody TypeAutocar type){
        type.setIdTypeAutocar(id);
        return typeautocarservice.save(type);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        typeautocarservice.delete(id);
    }

}
