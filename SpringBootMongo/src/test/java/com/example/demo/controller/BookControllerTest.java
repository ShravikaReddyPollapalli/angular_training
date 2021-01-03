
package com.example.demo.controller;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest {
	//Sending request to controller
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private BookService service;
	private Book book;
	@Before
	public void setUp() throws Exception {
		book = new Book(1234,"Testing with Mockito",new Author(1, "James"));
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetBookSuccess() throws Exception {
		when(service.getBookById(Mockito.anyInt())).
				thenReturn(book);
		
		mockMvc.perform(get("/books/getBook/1234"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name", is("Testing with Mockito")))
				.andDo(print());
		
		verify(service,times(1)).getBookById(Mockito.anyInt());
	
	}
	
	@Test
	public void testGetBookFailure() throws Exception {
		
		//When a call is given to service.getBook
		when(service.getBookById(Mockito.anyInt())).
				thenThrow(BookNotFoundException.class);
		
		mockMvc.perform(get("/books/getBook/123"))
				.andExpect(status().isConflict())
				.andDo(print());
		
		verify(service).getBookById(Mockito.anyInt());
	
	}
	
	@Test
	public void testAddBookSuccess() throws Exception{
		//setup the service mock
		when(service.saveBook(Mockito.any(Book.class))).thenReturn(book);
		
		//send a post request using mockMVC
		String bookJson = new ObjectMapper().writeValueAsString(book);
		
		mockMvc.perform(post("/books/saveBook")
						.contentType(MediaType.APPLICATION_JSON)
						.content(bookJson))
		.andExpect(status().isCreated());
		
		//verify mock has been called
		verify(service).saveBook(Mockito.any(Book.class));
		verifyNoMoreInteractions(service);
		
	}
}
