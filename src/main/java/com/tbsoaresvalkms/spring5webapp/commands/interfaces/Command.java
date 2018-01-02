package com.tbsoaresvalkms.spring5webapp.commands.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface Command {
    void execute();
}
