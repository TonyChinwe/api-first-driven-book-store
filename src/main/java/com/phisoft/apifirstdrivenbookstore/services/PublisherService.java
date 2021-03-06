package com.phisoft.apifirstdrivenbookstore.services;

import com.phisoft.apifirstdrivenbookstore.models.Publisher;

import java.util.List;

/**
 * Service contract for fetching all the book publishers in our store
 */
public interface PublisherService {
    /**
     * Finds all the book publishers in our store
     * @return list of book publisher in our store
     */
    public List<Publisher> findAllBookPublisher();
}
