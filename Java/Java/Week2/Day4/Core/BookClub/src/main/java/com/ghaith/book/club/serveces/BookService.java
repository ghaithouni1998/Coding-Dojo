package com.ghaith.book.club.serveces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.book.club.models.Book;
import com.ghaith.book.club.repositories.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	
//	Create 
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
//  READ ALL
	public Book findBookById(Long id) {
		Optional<Book> optBook= bookRepo.findById(id);
		if(optBook.isPresent()) {
			return optBook.get();
		}
		else {
		return null;
		}
	}
//	READ ALL
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	//edit
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    //delete
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
