package com.phisoft.apifirstdrivenbookstore.services;
import com.phisoft.apifirstdrivenbookstore.models.BookType;
import com.phisoft.apifirstdrivenbookstore.repositories.BookTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
@Qualifier("book-type-impl-one")
public class BookTypeServiceImpl implements BookTypeService{


    private BookTypeRepository bookTypeRepository;
    @Autowired
    public BookTypeServiceImpl(BookTypeRepository bookTypeRepository){
      this.bookTypeRepository=bookTypeRepository;

   }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<BookType> findAllBookTypes() {
        return bookTypeRepository.findAll();
    }
}
