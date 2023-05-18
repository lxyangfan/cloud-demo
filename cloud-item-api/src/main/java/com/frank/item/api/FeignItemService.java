package com.frank.item.api;

import com.frank.common.model.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "feignItemService", url = "http://cloud-item-service:8080")
public interface FeignItemService {

    @GetMapping("/items/{id}")
    ItemDTO getItemById(@PathVariable("id") Long id);

}
