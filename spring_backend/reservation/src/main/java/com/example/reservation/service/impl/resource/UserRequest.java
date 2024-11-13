package com.example.reservation.service.impl.resource;

import com.example.reservation.domain.User;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message="first name cannot be left blank")
    private String firstName;
    
    @NotBlank(message="last name cannot be left blank")
    private String lastName;

    @NotBlank(message="email cannot be left blank")
    private String email;

    private String mobileNumber;

    @NotBlank(message="username cannot be left blank")
    private String username;

    @NotBlank(message="password cannot be left blank")
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
