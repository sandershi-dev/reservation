package com.example.reservation.controller;

import java.sql.Date;
import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.reservation.domain.Guest;
import com.example.reservation.domain.Reservation;
import com.example.reservation.repository.ReservationRepository;


@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addReservation(@RequestParam String firstName, @RequestParam String lastName,
        @RequestParam String location, @RequestParam Integer guests, @RequestParam Date date, @RequestParam Time time,
        @RequestParam String email, @RequestParam String mobileNumber) {
        Guest g = new Guest();
        g.setFirstName(firstName);
        g.setLastName(lastName);
        g.setEmail(email);
        g.setMobileNumber(mobileNumber);
        Reservation r = new Reservation();
        r.setGuest(g);
        r.setDate(date);
        r.setLocation(location);
        r.setTime(time);
        r.setNumOfGuests(guests);
        reservationRepository.save(r);

        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }
    
}
