package com.tbsoaresvalkms.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class Spring5webappApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Spring5webappApplication.class, args);

        System.out.println("Manual initializer is be executing...");
        ManualInitializer bean = context.getBean(ManualInitializer.class);
        bean.execute();
    }
}
