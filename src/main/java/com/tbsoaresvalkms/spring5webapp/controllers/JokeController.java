package com.tbsoaresvalkms.spring5webapp.controllers;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jokes")
public class JokeController {
    private CommandQuery<String> chuckNorrisServices;

    public JokeController(CommandQuery<String> chuckNorrisServices) {
        this.chuckNorrisServices = chuckNorrisServices;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("joke", chuckNorrisServices.execute());
        return "jokes/chucknorris";
    }
}
