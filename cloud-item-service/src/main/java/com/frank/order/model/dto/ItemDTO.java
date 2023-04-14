package com.frank.order.model.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private OffsetDateTime createdAt;

    public static ItemDTO buildDummy() {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(1L);
        itemDTO.setName("Item 1");
        itemDTO.setDescription("Item 1 Description");
        itemDTO.setPrice(100.0);
        itemDTO.setCreatedAt(OffsetDateTime.now());
        return itemDTO;

    }
}
