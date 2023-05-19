package com.frank.item.controller;

import com.frank.common.model.dto.ItemDTO;
import com.frank.item.api.FeignItemService;
import com.frank.item.model.dto.OrderDTO;
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

    @Autowired
    private FeignItemService feignItemService;

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
        ItemDTO item = feignItemService.getItemById(1L);
        log.debug("User: {} is creating new order with item:{}", user, item);

        log.info("create new order");
        return OrderDTO.buildDummy();
    }

}
