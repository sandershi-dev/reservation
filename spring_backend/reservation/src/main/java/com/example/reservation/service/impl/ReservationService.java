package com.example.reservation.service.impl;
import java.util.List;
import com.example.reservation.domain.Reservation;

public interface  ReservationService {
    
    public void addReservation(Reservation reservation);

    public List<Reservation> getAllReservations();

    public Reservation getReservation(String Id);

    public void deleteReservation(String Id);
}
