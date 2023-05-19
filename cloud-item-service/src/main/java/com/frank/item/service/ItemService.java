package com.frank.item.service;

import com.frank.common.model.dto.ItemDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemService {

    @CircuitBreaker(name = "getItem", fallbackMethod = "getItemFallback")
    public ItemDTO getItem(Long id) {
        // 使用随机数模拟调用失败
        if (Math.random() > 0.8) {
            throw new RuntimeException("调用商品服务失败");
        }
        log.info("调用商品服务成功");
        return ItemDTO.builder()
                .id(id)
                .name("this is Real Item")
                .price(100.d)
                .build();
    }

    public ItemDTO getItemFallback(Long id, Exception e) {
        log.warn("getItemFallback is called for id: {}", id, e);
        return ItemDTO.buildDummy();
    }

}
