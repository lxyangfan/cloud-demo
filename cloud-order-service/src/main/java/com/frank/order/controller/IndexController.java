package com.frank.order.controller;

import com.frank.order.model.dto.OrderDTO;
import com.frank.user.api.FeignUserService;
import com.frank.common.model.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @Autowired
    private FeignUserService feignUserService;

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/orders/{id}")
    public OrderDTO getOrder() {
        return OrderDTO.buildDummy();
    }

    @PostMapping("/orders")
    public OrderDTO createOrder() {
        UserDTO user = feignUserService.getUserById(1L);
        log.debug("User: {} is creating new order", user);
        log.info("create new order");
        return OrderDTO.buildDummy();
    }

}
