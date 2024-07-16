package com.ghaith.book.club.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ghaith.book.club.models.Book;
import com.ghaith.book.club.models.User;
import com.ghaith.book.club.serveces.BookService;
import com.ghaith.book.club.serveces.UserService;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
    @Autowired
    private BookService bookSer;

    @Autowired
    private UserService userServ;

    // Display form to create a new book
    @GetMapping("/books/new")
    public String displayNewBookForm(@ModelAttribute("book") Book book, Model model, HttpSession session) {
    	// Route guard
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/"; 
        }

        User loggedUser = userServ.findUserById(userId);
        model.addAttribute("loggedUser", loggedUser);
        return "new.jsp";
    }

    // Process the creation of a new book
    @PostMapping("/processBook")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "new.jsp";
        }
     // Route guard
        Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/"; // Route guard
        }

        User user = userServ.findUserById(userId);
        book.setPoster(user);
        Book newBook = bookSer.createBook(book);
        return "redirect:/books";
    }

    // Display a single book by its ID
    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model , HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";
        }// Route guard
    	Book book = bookSer.findBookById(id);
        
        model.addAttribute("book", book);
        return "showone.jsp";
        
    }
    @GetMapping("/books")
    public String allBooks(Model model,HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
        User user = userServ.findUserById(userId);
        model.addAttribute("user", user);
        List<Book> allBooks= bookSer.allBooks();
        model.addAttribute("allBooks", allBooks);
        return "home.jsp";
    }

    @GetMapping("/books/{id}/edit")
    public String updateCr(@PathVariable("id") Long id, Model model,HttpSession session) {
    	// Route guard
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
    	Book book = bookSer.findBookById(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }

    @PutMapping("/updateBook/{id}")
    public String editBook(@Valid @ModelAttribute("book")  Book book, BindingResult result ,HttpSession session) {
        Long userId = (Long) session.getAttribute("user_id");

    	if (result.hasErrors()) {
            return "edit.jsp";
        }else {
        	
            User user = userServ.findUserById(userId);
            book.setPoster(user);
            bookSer.updateBook(book);
        }
        return "redirect:/books";
    }
    @DeleteMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id ,HttpSession session) {
    	Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";}
        bookSer.deleteBook(id);
        return "redirect:/books";
    }
}