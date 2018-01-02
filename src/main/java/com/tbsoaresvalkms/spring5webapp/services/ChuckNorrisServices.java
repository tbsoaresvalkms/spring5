package com.tbsoaresvalkms.spring5webapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServices implements ServicesQuery<String> {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServices(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String execute() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
