package com.library.demo.service;

import java.util.List;

import com.library.demo.model.Borrow;
import com.library.demo.model.Student;

public interface BorrowService {

	void updateBorrowList(Borrow borrow);

	List<Borrow> getBorrowList(int id);

}
