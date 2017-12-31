package com.tbsoaresvalkms.spring5webapp.repositories;

import com.tbsoaresvalkms.spring5webapp.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
