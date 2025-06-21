package com.agencevoyage.service;

import com.agencevoyage.model.Hotel;
import com.agencevoyage.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }
    public Optional<Hotel> getById(Long id){
        return hotelRepository.findById(id);
    }
    public Hotel save(Hotel hotel){
        return hotelRepository.save(hotel);
    }
    public void delete(Long id){
        hotelRepository.deleteById(id);
    }
}
