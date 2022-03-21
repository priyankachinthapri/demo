package com.library.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	
	 List<Book> findAll();
	 Optional<Book> findById(int id) ;
	void deleteById(Integer id);
	
}
