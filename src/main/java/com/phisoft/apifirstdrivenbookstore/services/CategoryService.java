package com.phisoft.apifirstdrivenbookstore.services;
import com.phisoft.apifirstdrivenbookstore.models.Category;
import java.util.List;

/**
 * Service contract for fetching all the book categories in our store
 */
public interface CategoryService {
    /**
     * Finds all the book categories in our store
     * @return list of book categories in our store
     */
    public List<Category> findAllBookCategory();
}
