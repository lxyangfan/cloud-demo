package com.frank.order.service;

import com.frank.user.model.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// OpenFeign Service which call user service
@FeignClient(value = "cloud-user-service")
public interface FeignUserService {

    // Get user by id, openFeign will convert this to a http request
    @GetMapping("/users/{id}")
    UserDTO getUserById(@PathVariable("id") Long id);

}
