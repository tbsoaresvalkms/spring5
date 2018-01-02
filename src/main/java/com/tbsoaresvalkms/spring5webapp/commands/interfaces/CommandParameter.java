package com.tbsoaresvalkms.spring5webapp.commands.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface CommandParameter<T> {
    void execute(T t);
}
