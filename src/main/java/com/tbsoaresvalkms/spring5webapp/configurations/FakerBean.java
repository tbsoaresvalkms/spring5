package com.tbsoaresvalkms.spring5webapp.configurations;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class FakerBean {
    @Bean
    public Faker faker() {
        return new Faker();
    }
}
