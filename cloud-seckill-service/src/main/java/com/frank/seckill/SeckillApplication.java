package com.frank.seckill;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableApolloConfig
public class SeckillApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SeckillApplication.class, args);
    }

}
