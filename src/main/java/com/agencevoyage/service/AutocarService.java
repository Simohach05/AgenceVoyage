package com.agencevoyage.service;

import com.agencevoyage.model.Autocar;
import com.agencevoyage.repository.AutocarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutocarService {

    @Autowired
    private AutocarRepository autocarRepository;

    public List<Autocar> getAll() {
        return autocarRepository.findAll();
    }

    public Optional<Autocar> getById(Long id) {
        return autocarRepository.findById(id);
    }

    public Autocar save(Autocar autocar) {
        return autocarRepository.save(autocar);
    }

    public void delete(Long id) {
        autocarRepository.deleteById(id);
    }
}
