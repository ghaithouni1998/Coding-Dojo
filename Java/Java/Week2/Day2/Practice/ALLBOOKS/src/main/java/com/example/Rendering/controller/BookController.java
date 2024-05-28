package com.example.Rendering.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Rendering.models.Book;
import com.example.Rendering.service.BookService;

import jakarta.validation.Valid;



@Controller
@RequestMapping("/books")
public class BookController {

private final BookService bookService;
	
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("")
	public String getAllBook(Model model){
		
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks",allBooks);
		return "liste.jsp";
	}
	
    

	
	@GetMapping("/create")
	public String displayForm(@ModelAttribute("book") Book book){
		
		return "form.jsp";
	}
	
	
	
	@PostMapping("/processBook")
	public String createBook(@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			// retrieve all books from db
			List<Book> allBooks = bookService.allBooks();
			model.addAttribute("allBooks",allBooks);
			return "form.jsp";
		}else {
			Book newBook = bookService.createBook(book);
			return "redirect:/books";
		}
		
	}
	
	@GetMapping("/{id}")
	public String findOneBookById(@PathVariable("id") Long id, Model model) {
		Book selectedBook = bookService.findBook(id);
		model.addAttribute("book",selectedBook);
		return "showOne.jsp";
	}
}


