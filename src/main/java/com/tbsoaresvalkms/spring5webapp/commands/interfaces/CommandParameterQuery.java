package com.tbsoaresvalkms.spring5webapp.commands.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface CommandParameterQuery<T, K> {
    K execute(T t);
}
