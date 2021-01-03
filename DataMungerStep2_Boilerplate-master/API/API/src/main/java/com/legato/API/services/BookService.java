package com.legato.API.services;

import com.legato.API.dao.BookDao;
import com.legato.API.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    public BookDao bookDao;
    @Autowired
    BookService(BookDao bookDao){
        this.bookDao = bookDao;

    }

    public Books createNewBook(Books book){
        return this.bookDao.save(book);
    }
}
