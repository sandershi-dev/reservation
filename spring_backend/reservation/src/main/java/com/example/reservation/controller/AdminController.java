package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.ReservationServiceImpl;


@RestController
public class AdminController {
    //@Autowired
   // private ReservationRepository reservationRepository;

    @Autowired
    private ReservationServiceImpl reservationService;

    @PostMapping("/admin/reservation/create")
    public void createReservation(Reservation reservation){
        reservationService.addReservation(reservation);
    }
    
    // @PutMapping("/admin/reservation/update")
    // public void updateReservation(Reservation){
    //     reservationService.updateReservation(reservation);
    // }

    @DeleteMapping("/admin/reservation/delete")
    public void deleteReservation(String id){
        reservationService.deleteReservation(id);
    }

    @GetMapping("/admin/reservations/all")
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }
    
}
