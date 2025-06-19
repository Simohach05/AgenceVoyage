package com.agencevoyage.controller;


import com.agencevoyage.model.Reservation;
import com.agencevoyage.service.ReservationService;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping
    public List<Reservation> getAll(){
        return reservationService.getAllReservations();
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation r){
        return reservationService.saveReservation(r);
    }
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation r){
        r.setIdReservation(id);
        return reservationService.saveReservation(r);
    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}
