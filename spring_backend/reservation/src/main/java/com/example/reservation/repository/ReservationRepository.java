package com.example.reservation.repository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservation.domain.Reservation;




@Repository
public interface ReservationRepository  extends JpaRepository<Reservation, String>{

    List<Reservation> findByDate(LocalDate date);

    List<Reservation> findByUserId(String userId);

    List<Reservation> findByTime(LocalTime time);
    
    
}
