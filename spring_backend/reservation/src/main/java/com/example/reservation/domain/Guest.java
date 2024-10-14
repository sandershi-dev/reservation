package com.example.reservation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @Entity
public class Guest {
    // @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String guestId;

    private String firstName;

    private String lastName;

    private String Email;
    
    private String mobileNumber;

    private String username;

    private String password;

    private String role;


}
