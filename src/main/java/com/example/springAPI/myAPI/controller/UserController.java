package com.example.springAPI.myAPI.controller;

import com.example.springAPI.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.springAPI.myAPI.model.User;

import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam String name){
        Optional<User> user = userService.getUser(name);
        return user.orElse(null);
    }

    @PostMapping("/adduser")
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
