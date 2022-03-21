package com.library.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.demo.controller.StudentController;
import com.library.demo.model.Student;
import com.library.demo.service.BookService;
import com.library.demo.service.BorrowService;
import com.library.demo.service.StudentService;
import com.library.demo.service.impl.StudentServiceImpl;


@WebMvcTest(StudentController.class)


class DemoApplicationTests {

	@MockBean
	StudentService studentService;
	@MockBean
	BookService bookService;
	
	@MockBean
	BorrowService borrowService;
	
	
	 @Autowired
	  private WebApplicationContext context;

	  private MockMvc mockMvc;
	 
	  @BeforeEach
	  public void setup() {
	    this.mockMvc = MockMvcBuilders
	      .webAppContextSetup(this.context)
	      .build();
	  }
	

	@Test
	public void testaddStudent() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
				.post("/addStudent")
			      .content(asJsonString(new Student(1, "test", 1, "test")))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().is(200));

	}
	@Test
	public void ViewStudents() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
				.get("/viewStudents")
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().is(200));

	}
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

}
