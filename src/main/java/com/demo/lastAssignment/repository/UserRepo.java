package com.demo.lastAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.lastAssignment.model.userModel;

public interface UserRepo extends JpaRepository<userModel, Integer> {

    userModel findByEmail(String email);
    
}