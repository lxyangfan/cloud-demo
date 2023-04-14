package com.frank.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableDiscoveryClient
public class UserApplication {

        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(UserApplication.class, args);
        }
}
