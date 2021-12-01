package com.example.techprotocol.controllers;

import com.example.techprotocol.models.User;
import com.example.techprotocol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    UserRepository users;


    @PostMapping("/createUser")
    public User createUser(@RequestBody User userToCreate) {
        userToCreate.setId(null);
        return users.save(userToCreate);
    }
}
