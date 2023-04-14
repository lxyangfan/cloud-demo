package com.frank.order.controller;

import com.frank.order.model.dto.ItemDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/items/{id}")
    public ItemDTO getUser() {
        return ItemDTO.buildDummy();
    }

}
