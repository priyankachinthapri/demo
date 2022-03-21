package com.library.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	 List<Student> findAll() ;

}
