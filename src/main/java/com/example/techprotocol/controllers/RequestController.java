package com.example.techprotocol.controllers;

import com.example.techprotocol.repositories.RelationRepository;
import com.example.techprotocol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    RelationRepository relations;

    @Autowired
    UserRepository users;

    @PostMapping("/")
    public HttpStat
}
