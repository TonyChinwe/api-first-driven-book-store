package com.phisoft.apifirstdrivenbookstore.repositories;

import com.phisoft.apifirstdrivenbookstore.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author's repository
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    /**
     * Fetach author using first name
     * @param name first name
     * @return author
     */
    public Author getAuthorByFirstName(String name);
}
