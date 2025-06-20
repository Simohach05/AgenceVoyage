package com.agencevoyage.service;


import com.agencevoyage.model.TypeAutocar;
import com.agencevoyage.repository.TypeAutocarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeAutocarService {
    @Autowired
    private TypeAutocarRepository typeAutocarRepository;

    public List<TypeAutocar> getAll(){
        return typeAutocarRepository.findAll();
    }
    public Optional<TypeAutocar> getById(Long id){
        return typeAutocarRepository.findById(id);
    }
    public TypeAutocar save(TypeAutocar Autocartype ){
        return typeAutocarRepository.save(Autocartype);
    }
    public void delete (Long id){
        typeAutocarRepository.deleteById(id);
    }

}
