package com.tbsoaresvalkms.spring5webapp.commands;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import com.tbsoaresvalkms.spring5webapp.models.Author;
import com.tbsoaresvalkms.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllAuthors implements CommandQuery<List<Author>> {
    private final AuthorRepository authorRepository;

    public GetAllAuthors(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> execute() {
        return authorRepository.findAll();
    }
}
