package com.library.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.demo.model.Borrow;
import com.library.demo.model.Student;
import com.library.demo.repository.BorrowRepository;
import com.library.demo.service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {
	@Autowired
	BorrowRepository borrowRepository;

	@Override
	public void updateBorrowList(Borrow borrow) {
		// TODO Auto-generated method stub
		borrowRepository.save(borrow);
		
	}

	@Override
	public List<Borrow> getBorrowList(int id) {
		// TODO Auto-generated method stub
		return borrowRepository.getbyStudentId(id);
	}

}
