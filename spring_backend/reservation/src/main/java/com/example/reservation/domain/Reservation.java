package com.example.reservation.domain;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @Entity
// @Table(name = "reservation")
public class Reservation {
    
    // @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name = "reservationID",nullable=false)
    private String reservationId;

    private String guestId;

    private String location;

    private int numOfGuests;

    private Date date;

    private Time time;

    
}
