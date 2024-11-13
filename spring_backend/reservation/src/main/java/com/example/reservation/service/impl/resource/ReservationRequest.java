package com.example.reservation.service.impl.resource;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.reservation.domain.Reservation;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {   


    @NotBlank(message="Name cannot be blank")
    private String user_id;
    
    @Min(value=1,message="cannot have less than 1 guest")
    private int numOfGuests;

    private LocalDate date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="HH:mm")
    private LocalTime time;

    public Reservation getReservation(){
        return Reservation.builder()
        .user_id(this.user_id)
        .numOfGuests(this.numOfGuests)
        .date(this.date)
        .time(this.time)
        .build();
    }
}
