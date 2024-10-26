package com.example.reservation.domain;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import jakarta.validation.constraints.Min;
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
    private String id;

    private String guest;

    @Min(value=1,message="cannot have less than 1 guest")
    private int numOfGuests;

    private Date date;

    private Time time;

    private Timestamp timestamp;

    
}
