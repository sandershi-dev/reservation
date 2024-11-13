package com.example.reservation.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.domain.User;
import com.example.reservation.repository.UserRepository;
import com.example.reservation.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    
    public User getUser(String id){
        return userRepository.findById(id).orElse(null);
    }

    public boolean validateUser(String username, String password){
        User user = userRepository.findByUsername(username);
        if(user != null)
            return user.getPassword().equals(password);
        else
            return false;
        
    }
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
