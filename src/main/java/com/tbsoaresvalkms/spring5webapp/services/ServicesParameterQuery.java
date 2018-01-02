package com.tbsoaresvalkms.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public interface ServicesParameterQuery<T, K> {
    K execute(T t);
}
