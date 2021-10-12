package com.phisoft.apifirstdrivenbookstore.repositories;
import com.phisoft.apifirstdrivenbookstore.models.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Book-type repository
 */
@Repository
public interface BookTypeRepository extends JpaRepository<BookType,Long> {

}
