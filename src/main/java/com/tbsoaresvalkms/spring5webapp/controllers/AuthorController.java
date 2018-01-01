package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.repositories.AuthorRepository;
import com.tbsoaresvalkms.spring5webapp.services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private AuthorRepository authorRepository;
    private Services authorServices;

    public AuthorController(AuthorRepository authorRepository, Services authorServices) {
        this.authorRepository = authorRepository;
        this.authorServices = authorServices;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        authorServices.execute();
        return "authors/index";
    }
}

