package com.agencevoyage.controller;

import com.agencevoyage.model.PointDepart;
import com.agencevoyage.service.PointDepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/points_depart")
public class PointDepartController {
    @Autowired
    private PointDepartService pointDepartService;
    @GetMapping
    public List<PointDepart> getAll(){
        return pointDepartService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<PointDepart> get(@PathVariable Long id){
        return pointDepartService.getById(id);
    }
    @PostMapping
    public PointDepart create(@RequestBody PointDepart pointDepart){
        return pointDepartService.save(pointDepart);
    }
    @PutMapping("/{id}")
    public PointDepart update(@PathVariable Long id, @RequestBody PointDepart pointDepart){
       pointDepart.setIdPointDepart(id);
        return pointDepartService.save(pointDepart);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        pointDepartService.delete(id);
    }
}
