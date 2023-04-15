package com.frank.order;

import com.frank.user.api.FeignUserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = {
        FeignUserService.class
})
public class OrderApplication {

        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(OrderApplication.class, args);
        }
}
