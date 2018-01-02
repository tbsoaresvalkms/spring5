package com.tbsoaresvalkms.spring5webapp.commands;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import com.tbsoaresvalkms.spring5webapp.models.Book;
import com.tbsoaresvalkms.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllBooks implements CommandQuery<List<Book>> {
    private final BookRepository bookRepository;

    public GetAllBooks(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> execute() {
        return bookRepository.findAll();
    }
}
