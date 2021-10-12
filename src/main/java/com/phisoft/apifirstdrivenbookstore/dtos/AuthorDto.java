package com.phisoft.apifirstdrivenbookstore.dtos;

import com.phisoft.apifirstdrivenbookstore.models.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto {

    private String firstName;
    private String lastName;
    private List<Book> books;

}
