package com.example.reservation.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservation.domain.Reservation;




@Repository
public interface ReservationRepository  extends JpaRepository<Reservation, String>{

    List<Reservation> findByDate(Date date);

    List<Reservation> findByGuestName(String guestName);

    List<Reservation> findByTime(Time time);

    
}
