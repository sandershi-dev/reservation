package com.example.reservation.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

    //@Autowired
   // private Connection connection;

    private final Map<String,Reservation> reservationMap = new HashMap<>();

    @Override
    public void addReservation(Reservation reservation){
        int count = new Random().nextInt(0,99999999);
        reservation.setId(String.valueOf(count));
        reservationMap.put(reservation.getId(),reservation);
    
    }

    @Override
    public Set<Reservation> getAllReservations(){
        return new HashSet<>(reservationMap.values());
    }

    public Reservation updateReservation(String id, Reservation reservation){
        if(reservationMap.containsKey(id)){
            reservationMap.put(id,reservation);
        }
        return reservation;
    }

    @Override
    public Reservation getReservation(String id){

        return reservationMap.getOrDefault(id, null);
    }
    @Override
    public void deleteReservation(String id){
        reservationMap.remove(id);
    }
}
