package com.frank.item;

import com.frank.item.api.FeignItemService;
import com.frank.user.api.FeignUserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableFeignClients(basePackageClasses = {
        FeignUserService.class,
        FeignItemService.class
})
public class OrderApplication {

        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(OrderApplication.class, args);
        }
}
