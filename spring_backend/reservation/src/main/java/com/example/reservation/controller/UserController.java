package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.User;
import com.example.reservation.service.impl.UserServiceImpl;
import com.example.reservation.service.impl.resource.UserRequest;




@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;
    
    @PostMapping("/user/create")
    public void createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest.getUser());
    }

    @GetMapping("/user/get")
    public ResponseEntity<User> getUserById(@RequestParam String id) {
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);

    }
    @PutMapping("/user/update/{id}")
    public void updateUser(@PathVariable String id, @RequestBody UserRequest userRequest) {
        userService.updateUser(id, userRequest.getUser());
    }

    @DeleteMapping("/user/delete")
    public void deleteUser(@RequestParam String id){
        userService.deleteUser(id);
    }
    
    
}
