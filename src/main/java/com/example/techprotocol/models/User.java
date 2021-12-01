package com.example.techprotocol.models;

import lombok.Data;

@Data
public class User {
    String email;
    String name;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
