package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.repositories.AuthorRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/index";
    }
}

