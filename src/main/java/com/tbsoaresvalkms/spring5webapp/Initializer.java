package com.tbsoaresvalkms.spring5webapp;

import com.tbsoaresvalkms.spring5webapp.repositories.AuthorRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements ApplicationRunner {
    private AuthorRepository authorRepository;

    public Initializer(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
    }
}
