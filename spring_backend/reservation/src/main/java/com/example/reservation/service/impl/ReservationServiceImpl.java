package com.example.reservation.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.domain.Reservation;
import com.example.reservation.repository.ReservationRepository;
import com.example.reservation.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;


    @Override
    public void addReservation(Reservation reservation){
        reservationRepository.save(reservation);
    
    }

    @Override
    public Reservation getReservation(String id){
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReservation(String id){
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation updateReservation(String id, Reservation reservation){
        Optional<Reservation> originalReservation = reservationRepository.findById(id);
        if(originalReservation.isPresent()){
            reservationRepository.save(reservation);
            return reservation;
        }
        return null;
    }

    @Override
    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    

}
