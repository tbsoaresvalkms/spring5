package com.tbsoaresvalkms.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public class BookServices implements Services {
    @Override
    public void execute() {
        System.out.println("Executing book`s service...");
    }
}
