package com.example.reservation.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name = "id",nullable=false)
    private String id;

    private String firstName;

    private String lastName;

    private String email;
    
    private String mobileNumber;

    private String username;

    private String password;

    private String role;

    @OneToMany(mappedBy="user")
    List<Reservation> reservation_history;

}
