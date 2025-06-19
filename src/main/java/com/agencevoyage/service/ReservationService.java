package com.agencevoyage.service;


import com.agencevoyage.model.Reservation;
import com.agencevoyage.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }
    public Optional<Reservation> getReservationById(Long id){
        return reservationRepository.findById(id);
    }
    public Reservation saveReservation(Reservation r){
        return reservationRepository.save(r);
    }
    public void deleteReservation(Long id){
        reservationRepository.deleteById(id);
    }
}

