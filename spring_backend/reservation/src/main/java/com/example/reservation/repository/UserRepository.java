package com.example.reservation.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservation.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
    List<User> findByEmail(String email);
    
    List<User> findByMobileNumber(String mobileNumber);

    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

    User findByUsername(String username);
}
