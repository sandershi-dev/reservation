package com.example.reservation.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.reservation.domain.User;
import com.example.reservation.repository.UserRepository;
import com.example.reservation.service.UserService;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user){
        userRepository.save(user);
    }

    @Override 
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(String id, User user){
        Optional<User> originalUser = userRepository.findById(id);
        if(originalUser.isPresent()){
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @Override 
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
