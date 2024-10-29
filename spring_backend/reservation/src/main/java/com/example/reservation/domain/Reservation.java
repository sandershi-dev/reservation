package com.example.reservation.domain;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

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
import lombok.Builder;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "reservation")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private String id;

    @NotBlank(message="user cannot be blank")
    private String user_id;

    @ManyToOne
    @JoinColumn(name="user",referencedColumnName="id")
    private User user;

    @Min(value=1,message="cannot have less than 1 guest")
    private int numOfGuests;

    private Date date;

    private Time time;

    private Timestamp timestamp;



    
}
