package com.library.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.demo.model.Book;
@Service
public interface BookService {

	List<Book> getBooks();

	Book addBook(Book book);

	Optional<Book> getBookById(int bid);

	void updateBook(Book book);

	void deleteBook(Integer id);

}
