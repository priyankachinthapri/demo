package com.library.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.library.demo.model.Book;
import com.library.demo.model.Borrow;
import com.library.demo.model.Student;
import com.library.demo.service.BookService;
import com.library.demo.service.BorrowService;
import com.library.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	@Autowired
	BookService bookService;
	
	@Autowired
	BorrowService borrowService;
	
	  @GetMapping("/viewStudents")
	    public String viewBooks(Model model) {

	        model.addAttribute("students", studentService.getStudents());
	        
	        return "viewStudents";
	    }

	  @PostMapping("/addStudent")
	    public String addBook(Student student,Model model) {
		  Optional<Book> optionslbook=bookService.getBookById(student.getBid());
		 
		  
	        
	        List<Borrow> borrowList = borrowService.getBorrowList(student.getId());
	        if(borrowList.size()>0) {
	        	 model.addAttribute("addfalsemessage", true);
	        }else {
	        	 Borrow borrow=new Borrow();
	        	 Student addStudent = studentService.addStudent(student);
	 	        model.addAttribute("savedStudent", addStudent);
	 	      
	 	       Book book=optionslbook.isPresent()? optionslbook.get():null;
	 	       if(book!=null) {
	 	    	  bookService.deleteBook(student.getBid());
	 	    	  student.setbName(book.getbName());
	 	       }
	 	      if(addStudent!=null) {
	 	    	 borrow.setBid(addStudent.getBid());
		 	        borrow.setSid(addStudent.getId());
		 	       borrowService.updateBorrowList(borrow);
		 	       
	 	      }
	 	       
	 	       model.addAttribute("addStudentSuccess", true);
	        }
	       
	       
	        return "addStudent";
	    }
	  @GetMapping("/addStudent")
	    public String addBookGet(Model model) {
		  model.addAttribute("student",new Student());
		 
		  if(bookService.getBooks().size()>0) {
			  model.addAttribute("books", bookService.getBooks());
		  }else {
			  model.addAttribute("books", new ArrayList<Book>());
			  model.addAttribute("addemptyBook", true);
			  
		  }
		  
	        return "addStudent";
	    }
}
