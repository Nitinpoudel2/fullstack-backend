package com.devnitin.fullstack_backend.repository;


import com.devnitin.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// connect our mysql to the repository

public interface UserRepository extends JpaRepository<User, Long> {


}
