package com.example.Rendering.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Rendering.models.Book;
import com.example.Rendering.service.BookService;

@Controller
@RequestMapping("/api/books")
public class ApiBook {
	
	private final BookService bookService;
	
    public ApiBook(BookService bookService){
        this.bookService = bookService;
    }
    
	@GetMapping("")
	public List<Book> getAllBook(){
		
		List<Book> bookList = bookService.allBooks();
		
		return bookList;
	}
	
	@PostMapping("")
	public Book create(@RequestParam(value = "title") String title, 
			@RequestParam(value = "description") String description,
			@RequestParam(value = "language") String language, 
			@RequestParam(value = "numOfPages") Integer numOfPages) {
		
		Book newBook = new Book(title, description, language, numOfPages );
		
		return bookService.createBook(newBook);
	}
	
	@GetMapping("/{id}")
	public Book findOneBookById(@PathVariable("id") Long id) {
		return bookService.findBook(id);
	}
	
	// TODO Create JSP files
}
