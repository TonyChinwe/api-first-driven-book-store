package com.phisoft.apifirstdrivenbookstore.repositories;

import com.phisoft.apifirstdrivenbookstore.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Book's Publisher repository
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    Publisher getPublisherByName(String name);

}
