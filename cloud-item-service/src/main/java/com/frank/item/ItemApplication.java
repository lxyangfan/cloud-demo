package com.frank.item;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
}, scanBasePackages = {
        "com.frank.item"
})
public class ItemApplication {

        public static void main(String[] args) {
            org.springframework.boot.SpringApplication.run(ItemApplication.class, args);
        }
}
