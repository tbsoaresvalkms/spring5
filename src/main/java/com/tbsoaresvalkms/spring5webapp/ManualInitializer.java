package com.tbsoaresvalkms.spring5webapp;

import com.tbsoaresvalkms.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class ManualInitializer {
    private BookRepository bookRepository;

    public ManualInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void execute() {
        bookRepository.findAll().forEach(System.out::println);
    }
}
