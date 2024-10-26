package com.example.reservation.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.impl.ReservationServiceImpl;


@RestController
public class AdminController {


    @Autowired
    private ReservationServiceImpl reservationService;

    @PostMapping("/admin/reservation/create")
    public void createReservation(Reservation reservation){
        reservationService.addReservation(reservation);
    }
    
    @PutMapping("/admin/reservation/update")
    public void updateReservation(String id,Reservation reservation){
        reservationService.updateReservation(id,reservation);
    }

    @DeleteMapping("/admin/reservation/delete")
    public void deleteReservation(String id){
        reservationService.deleteReservation(id);
    }

    @GetMapping("/admin/reservations/all")
    public ResponseEntity<Set<Reservation>> getAllReservations(){
        return new ResponseEntity<>(reservationService.getAllReservations(), HttpStatus.OK);
    }
    
}
