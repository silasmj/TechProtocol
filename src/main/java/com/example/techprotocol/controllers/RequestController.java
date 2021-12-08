package com.example.techprotocol.controllers;

import com.example.techprotocol.models.User;
import com.example.techprotocol.repositories.RelationRepository;
import com.example.techprotocol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Controller
public class RequestController {

    @Autowired
    RelationRepository relations;

    @Autowired
    UserRepository users;

    final String API_GREETING_POST = "http://localhost:9091/friendship";
    WebClient webClient = WebClient.create("http://localhost:9091");

    @PostMapping("/sendRequest")
    public String request(Model model) {
        WebClient webClient = WebClient.builder()
                .baseUrl(API_GREETING_POST)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        String request = "\"hi from client\"";
        String key = "\"request\"";
        String response = webClient.post()
                .body(Mono.just("{"+ key +":"+request+ "}"), String.class)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        model.addAttribute("greeting", response);
        return "index";
    }
}
