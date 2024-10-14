package com.example.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseEntity;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.ReservationServiceImpl;

@RestController
public class UserController {
    @Autowired
    ReservationServiceImpl reservationService;

    @GetMapping("/reservation/get/{id}")
    public ResponseEntity<Reservation> getReservation(@PathVariable("id") String reservationId){
        return new ResponseEntity<>(reservationService.getReservation(reservationId), HttpStatus.OK);
    }

    @PostMapping("/reservation/create")
    public void createReservation(@RequestBody Reservation reservation){
        reservationService.addReservation(reservation);
    }
    
    // @PutMapping("/reservation/update/{id}")
    // public void updateReservation(@PathVariable("id") String reservationId){
        
    // }

    @DeleteMapping("/reservation/delete/{id}")
    public void deleteReservation(@PathVariable("id") String reservationId){
        reservationService.deleteReservation(reservationId);
    }
}
