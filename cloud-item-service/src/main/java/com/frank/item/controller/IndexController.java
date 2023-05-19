package com.frank.item.controller;

import com.frank.common.model.dto.ItemDTO;
import com.frank.item.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private ItemService itemService;

    public IndexController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/items/{id}")
    public ItemDTO getItem(@PathVariable("id") Long id) {
        return itemService.getItem(id);
    }

}
