package com.example.gitpractice.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.gitpractice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser() {
        Long userId = userService.RegisterUser();
        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(userId)
            .toUri();
        return ResponseEntity.created(location).build();
    }
}
