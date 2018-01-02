package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import com.tbsoaresvalkms.spring5webapp.models.Author;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private CommandQuery<List<Author>> getAllAuthors;

    public AuthorController(CommandQuery<List<Author>> getAllAuthors) {
        this.getAllAuthors = getAllAuthors;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("authors", getAllAuthors.execute());
        return "authors/index";
    }
}

