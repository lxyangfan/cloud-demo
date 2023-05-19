package com.frank.item.model.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private Long itemId;
    private Integer quantity;
    private Double totalPrice;
    private OffsetDateTime createdAt;

    public static OrderDTO buildDummy() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(1L);
        orderDTO.setUserId(1L);
        orderDTO.setItemId(1L);
        orderDTO.setQuantity(1);
        orderDTO.setTotalPrice(100.0);
        orderDTO.setCreatedAt(OffsetDateTime.now());
        return orderDTO;
    }
}
