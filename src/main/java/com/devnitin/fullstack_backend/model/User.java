package com.devnitin.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
// write all the entities that I will be using in the application
@Id
@GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String email;


    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}
