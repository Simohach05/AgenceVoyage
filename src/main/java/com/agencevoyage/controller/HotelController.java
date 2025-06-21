package com.agencevoyage.controller;

import com.agencevoyage.model.Hotel;
import com.agencevoyage.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @GetMapping
    public List<Hotel> getAll(){
        return hotelService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Hotel> get(@PathVariable Long id){
        return hotelService.getById(id);
    }
    @PostMapping
    public Hotel create(@RequestBody Hotel hotel){
        return hotelService.save(hotel);
    }
    @PutMapping("/{id}")
    public Hotel update(@PathVariable Long id, @RequestBody Hotel hotel){
        hotel.setIdHotel(id);
        return hotelService.save(hotel);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        hotelService.delete(id);
    }


}


