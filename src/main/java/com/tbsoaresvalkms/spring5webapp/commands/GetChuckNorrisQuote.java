package com.tbsoaresvalkms.spring5webapp.commands;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandQuery;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetChuckNorrisQuote implements CommandQuery<String> {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public GetChuckNorrisQuote(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String execute() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
