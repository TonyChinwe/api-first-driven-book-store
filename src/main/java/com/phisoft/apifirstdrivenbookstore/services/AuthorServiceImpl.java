package com.phisoft.apifirstdrivenbookstore.services;
import com.phisoft.apifirstdrivenbookstore.models.Author;
import com.phisoft.apifirstdrivenbookstore.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@inheritDoc}
 */

@Service
@Qualifier("author-impl-one")
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;
     @Autowired
    public  AuthorServiceImpl(AuthorRepository authorRepository){
     this.authorRepository=authorRepository;
    }
    /**
     * {@inheritDoc}
     */

    @Override
    public List<Author> findAllAuthors(){
            return authorRepository.findAll();
        }

}
