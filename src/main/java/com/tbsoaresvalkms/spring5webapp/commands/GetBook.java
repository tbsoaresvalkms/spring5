package com.tbsoaresvalkms.spring5webapp.commands;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandParameterQuery;
import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import com.tbsoaresvalkms.spring5webapp.exceptions.BookNotFoundException;
import com.tbsoaresvalkms.spring5webapp.models.Book;
import com.tbsoaresvalkms.spring5webapp.repositories.BookRepository;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetBook implements CommandParameterQuery<Long, Book> {
    private final BookRepository bookRepository;

    public GetBook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book execute(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
    }
}
