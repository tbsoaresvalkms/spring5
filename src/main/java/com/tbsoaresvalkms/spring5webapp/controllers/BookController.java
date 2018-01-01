package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.repositories.BookRepository;
import com.tbsoaresvalkms.spring5webapp.services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    private BookRepository bookRepository;
    private Services bookServices;

    public BookController(BookRepository bookRepository, Services bookServices) {
        this.bookRepository = bookRepository;
        this.bookServices = bookServices;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        bookServices.execute();
        return "books/index";
    }
}
