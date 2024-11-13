package com.example.reservation.service.impl.resource;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    
    @NotBlank(message="username cannot be left blank")
    private String username;
    @NotBlank(message="password cannot be left blank")
    private String password;
}
