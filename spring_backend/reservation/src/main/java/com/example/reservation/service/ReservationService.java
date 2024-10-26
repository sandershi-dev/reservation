package com.example.reservation.service;
import java.util.Set;

import com.example.reservation.domain.Reservation;

public interface  ReservationService {
    
    public void addReservation(Reservation reservation);

    public Set<Reservation> getAllReservations();

    public Reservation getReservation(String Id);

    public void deleteReservation(String Id);
}
