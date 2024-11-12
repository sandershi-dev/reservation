package com.example.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.impl.ReservationServiceImpl;
import com.example.reservation.service.impl.resource.ReservationRequest;

import jakarta.validation.Valid;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ReservationController {
    @Autowired
    ReservationServiceImpl reservationService;

    @GetMapping("/reservation/get")
    public ResponseEntity<Reservation> getReservationById(@RequestParam String reservationId){
        return new ResponseEntity<>(reservationService.getReservation(reservationId), HttpStatus.OK);
    }

    @PostMapping("/reservation/create")
    public void createReservation(@RequestBody @Valid ReservationRequest reservationRequest){
        reservationService.addReservation(reservationRequest.getReservation());
    }
    
    @PutMapping("/reservation/update/{id}")
    public void updateReservation(@PathVariable String id,@RequestBody ReservationRequest reservationRequest){
        reservationService.updateReservation(id,reservationRequest.getReservation());
    }

    @DeleteMapping("/reservation/delete")
    public void deleteReservation(@RequestParam String id){
        reservationService.deleteReservation(id);
    }
}
