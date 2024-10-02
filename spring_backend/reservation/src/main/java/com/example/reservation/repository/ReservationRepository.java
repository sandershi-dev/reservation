package com.example.reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.reservation.domain.Reservation;

public interface ReservationRepository  extends CrudRepository<Reservation, Integer> {
    
}
