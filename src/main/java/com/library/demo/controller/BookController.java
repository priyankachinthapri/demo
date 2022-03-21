package com.library.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.library.demo.model.Book;
import com.library.demo.service.BookService;
@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	  @GetMapping("/viewBooks")
	    public String viewBooks(Model model) {
	        model.addAttribute("books", bookService.getBooks());
	        return "viewbook";
	    }
	  @GetMapping("/showContent")
	    public String showContent(Model model) {


	        return "book";
	    }
	  @GetMapping("/library")
	    public String getLibrary(Model model) {
	        
	        return "index";
	    }

	  @PostMapping("/addBook")
	    public String addBook(Book book,Model model) {
	        Book addBook = bookService.addBook(book);
	        model.addAttribute("savedBook", addBook);
	        model.addAttribute("addBookSuccess", true);
	        return "addBook";
	    }
	  @GetMapping("/addBook")
	    public String addBookGet(Model model) {
		  model.addAttribute("book",new Book());
	        return "addBook";
	    }
}
