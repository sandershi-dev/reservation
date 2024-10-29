package com.example.reservation.service;
import java.util.List;

import com.example.reservation.domain.User;

public interface UserService {

    public void createUser(User user);

    public void deleteUser(String userId);

    public User updateUser(String userId,User user);

    public List<User> getAllUsers();

    
}
