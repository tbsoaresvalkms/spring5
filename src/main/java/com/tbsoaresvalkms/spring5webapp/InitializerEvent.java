package com.tbsoaresvalkms.spring5webapp;

import com.github.javafaker.Faker;
import com.tbsoaresvalkms.spring5webapp.models.Author;
import com.tbsoaresvalkms.spring5webapp.models.Book;
import com.tbsoaresvalkms.spring5webapp.models.Publisher;
import com.tbsoaresvalkms.spring5webapp.repositories.AuthorRepository;
import com.tbsoaresvalkms.spring5webapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Component
public class InitializerEvent implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;
    private Faker faker;

    public InitializerEvent(BookRepository bookRepository, Faker faker) {
        this.bookRepository = bookRepository;
        this.faker = faker;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        LongStream.range(0, 10)
                .mapToObj(this::createAuthorWithBooks)
                .peek(System.out::println)
                .forEach(bookRepository::saveAll);
    }

    private Set<Book> createAuthorWithBooks(long count) {
        Author author = Author.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();

        Publisher publisher = Publisher.builder()
                .name(faker.company().name())
                .address(faker.address().fullAddress())
                .build();

        return LongStream.range(0, faker.number().numberBetween(0, 5))
                .mapToObj(this::createBook)
                .peek(book -> book.setAuthors(new HashSet<>(Collections.singleton(author))))
                .peek(book -> book.setPublisher(publisher))
                .collect(Collectors.toSet());
    }

    private Book createBook(long count) {
        return Book.builder()
                .title(faker.book().title())
                .isbn(faker.number().digits(10))
                .build();
    }
}
