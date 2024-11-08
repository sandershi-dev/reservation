package com.example.reservation.service.impl.resource;

import com.example.reservation.domain.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String firstName;
    
    private String lastName;

    private String email;

    private String mobileNumber;

    private String username;

    private String password;

    public User getUser(){
        return User.builder()
        .firstName(this.firstName)
        .lastName(this.lastName)
        .email(this.email)
        .mobileNumber(this.mobileNumber)
        .username(this.username)
        .password(this.password).build();
    }
}
