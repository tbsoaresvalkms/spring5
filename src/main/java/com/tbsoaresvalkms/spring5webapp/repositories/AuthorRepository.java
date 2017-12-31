package com.tbsoaresvalkms.spring5webapp.repositories;

import com.tbsoaresvalkms.spring5webapp.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{
}
