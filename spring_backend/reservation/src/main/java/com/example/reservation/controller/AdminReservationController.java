package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.impl.ReservationServiceImpl;
import com.example.reservation.service.impl.resource.ReservationRequest;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdminReservationController {


    @Autowired
    private ReservationServiceImpl reservationService;

    @PostMapping("/admin/reservation/create")
    public void createReservation(@RequestBody ReservationRequest reservationRequest){
        reservationService.addReservation(reservationRequest.getReservation());
    }
    
    @PutMapping("/admin/reservation/update")
    public void updateReservation(@RequestParam String id,@RequestBody ReservationRequest reservationRequest){
        reservationService.updateReservation(id,reservationRequest.getReservation());
    }

    @DeleteMapping("/admin/reservation/delete")
    public void deleteReservation(String id){
        reservationService.deleteReservation(id);
    }

    @GetMapping("/admin/reservations/all")
    public ResponseEntity<List<Reservation>> getAllReservations(){
        return new ResponseEntity<>(reservationService.getAllReservations(), HttpStatus.OK);
    }
    
}
