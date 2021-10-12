package com.phisoft.apifirstdrivenbookstore.services;

import com.phisoft.apifirstdrivenbookstore.models.Publisher;
import com.phisoft.apifirstdrivenbookstore.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
@Qualifier("publisher-impl-one")
public class PublisherServiceImpl implements PublisherService {

    private PublisherRepository publisherRepository;
    @Autowired
    public PublisherServiceImpl(PublisherRepository publisherRepository){
        this.publisherRepository=publisherRepository;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Publisher> findAllBookPublisher() {
      return publisherRepository.findAll();
    }
}
