package com.frank.common.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private OffsetDateTime createdAt;

    public static ItemDTO buildDummy() {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(1L);
        itemDTO.setName("FAKE ITEM");
        itemDTO.setDescription("Fake Description");
        itemDTO.setPrice(-100.0);
        itemDTO.setCreatedAt(OffsetDateTime.now());
        return itemDTO;

    }
}
