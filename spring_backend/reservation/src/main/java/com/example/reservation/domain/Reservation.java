package com.example.reservation.domain;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.example.reservation.service.impl.resource.ReservationRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private String id;

    @NotBlank(message="Name cannot be blank")
    private String guestName;

    @Min(value=1,message="cannot have less than 1 guest")
    private int numOfGuests;

    private Date date;

    private Time time;

    private Timestamp timestamp;

    public Reservation(ReservationRequest reservationRequest){
        this.guestName= reservationRequest.getGuestName();
        this.numOfGuests= reservationRequest.getNumOfGuests();
        this.date= reservationRequest.getDate();
        this.time= reservationRequest.getTime();
        this.timestamp= new Timestamp(System.currentTimeMillis());
    }

    
}
