package com.example.demo.service;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.demo.exception.BookAlreadyExistsException;
import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RunWith(MockitoJUnitRunner.class)

public class BookServiceImplTest {
	@Mock
	private BookRepository bookRepository;
	@InjectMocks
	private BookServiceImpl service;
	Book book;
	Optional<Book> optBook;
	@Before
	public void setUp() throws Exception {
		book = new Book(1234, "Testing with Mockito", new Author(1, "James"));
		optBook = Optional.of(book);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected = BookAlreadyExistsException.class)
	public void testAddBookFailure() throws BookAlreadyExistsException {
		when(bookRepository.findById(Mockito.anyInt())).
				thenReturn(optBook);
		service.saveBook(book);
		verify(bookRepository).findById(Mockito.anyInt());
	}
	
	@Test
	public void testAddBookSuccess() throws BookAlreadyExistsException {
		// BookRepository repo = Mockito.mock(BookRepository.class);
		when(bookRepository.findById(Mockito.anyInt())).
					thenReturn(Optional.empty());
		when(bookRepository.save(Mockito.any(Book.class))).
					thenReturn(book);
		Book addedBook = service.saveBook(book);
		assertEquals(book.getName(), addedBook.getName());
		
		verify(bookRepository).findById(Mockito.anyInt());
		verify(bookRepository).save(Mockito.any());
	}
}