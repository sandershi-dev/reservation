package com.example.reservation.service.impl.resource;

import java.sql.Date;
import java.sql.Time;

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
    private String guestName;
    
    @Min(value=1,message="cannot have less than 1 guest")
    private int numOfGuests;

    private Date date;

    private Time time;
}
