package com.frank.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/users/{id}")
    public com.frank.user.model.dto.UserDTO getUser() {
        return com.frank.user.model.dto.UserDTO.buildDummy();
    }

}
