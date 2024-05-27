package com.example.Rendering.repositorie;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Rendering.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	  // this method retrieves all the books from the database
    List<Book> findAll();

}