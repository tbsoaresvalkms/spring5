package com.tbsoaresvalkms.spring5webapp.repositories;

import com.tbsoaresvalkms.spring5webapp.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
