package com.frank.order;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableDiscoveryClient
public class ItemApplication {

        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(ItemApplication.class, args);
        }
}
