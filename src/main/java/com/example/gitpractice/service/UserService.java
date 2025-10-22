package com.example.gitpractice.service;

import org.springframework.stereotype.Service;
import com.example.gitpractice.entity.User;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    private final User user;

    public Long RegisterUser() {
        return user.getId();
    }
}
