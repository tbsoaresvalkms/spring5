package com.tbsoaresvalkms.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public interface ServicesParameter<T> {
    void execute(T t);
}
