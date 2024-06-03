package com.ghaith.book.club.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.book.club.models.Book;



public interface BookRepo extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
