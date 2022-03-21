package com.library.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Borrow;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Long> {
	
	
@Query("From Borrow b where b.sid=?1")
	List<Borrow> getbyStudentId(int id);

}
