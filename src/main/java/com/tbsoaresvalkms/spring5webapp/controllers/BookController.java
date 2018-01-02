package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import com.tbsoaresvalkms.spring5webapp.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final CommandQuery<List<Book>> getAllBooks;

    public BookController(CommandQuery<List<Book>> getAllBooks) {
        this.getAllBooks = getAllBooks;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", getAllBooks.execute());
        return "books/index";
    }
}
