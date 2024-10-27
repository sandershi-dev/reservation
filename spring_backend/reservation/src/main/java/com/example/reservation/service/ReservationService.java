package com.example.reservation.service;
import java.util.List;

import com.example.reservation.domain.Reservation;

public interface  ReservationService {
    
    public void addReservation(Reservation reservation);

    public List<Reservation> getAllReservations();

    public Reservation getReservation(String id);

    public void deleteReservation(String id);

    public Reservation updateReservation(String id, Reservation reservation);
}
