package com.example.springsecurityjpa;

import java.util.Optional;

import com.example.springsecurityjpa.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
