package com.library.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.demo.model.Student;
@Service
public interface StudentService {

	List<Student> getStudents();

	Student addStudent(Student student);

}
