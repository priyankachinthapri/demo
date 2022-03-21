package com.library.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.demo.model.Book;
import com.library.demo.repository.BookRepository;
import com.library.demo.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;


	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}


	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}


	@Override
	public Optional<Book> getBookById(int bid) {
		// TODO Auto-generated method stub
		return bookRepository.findById(bid);
	}


	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		
	}


	@Override
	@Transactional
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
		
	}

}
