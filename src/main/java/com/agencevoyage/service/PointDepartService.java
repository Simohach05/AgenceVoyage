package com.agencevoyage.service;

import com.agencevoyage.model.PointDepart;
import com.agencevoyage.repository.PointDepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PointDepartService {
    @Autowired
    private PointDepartRepository pointDepartRepository;
    public List<PointDepart> getAll(){
        return pointDepartRepository.findAll();
    }
    public Optional<PointDepart> getById(Long id){
        return pointDepartRepository.findById(id);
    }
    public PointDepart save(PointDepart pointDepart){
        return pointDepartRepository.save(pointDepart);
    }
    public void delete(Long id){
        pointDepartRepository.deleteById(id);
    }
}
