package com.frank.user.controller;

import com.frank.common.model.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/users/{id}")
    public UserDTO getUser() {
        return UserDTO.buildDummy();
    }

}
