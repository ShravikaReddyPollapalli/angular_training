package com.legato.API.controllers;

import com.legato.API.models.Books;
import com.legato.API.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class BooksController {
    BookService bookService;
    @Autowired // this is called as constructor
    BooksController(BookService service){
        this.bookService = service;
    }

    @GetMapping("/public/api/v1/greet/{message}")
    public ResponseEntity<String> sayHello(@PathVariable String message) {
        System.out.println(message);
        return new ResponseEntity<String>(message, HttpStatus.OK);

    }

    @PostMapping("/public/api/v1/favourites")
    public ResponseEntity<Books> saveFavourite(@RequestBody Books book) {
        System.out.println(book.toString());
        Books newBook = this.bookService.createNewBook(book);
        return new ResponseEntity<Books>(newBook, HttpStatus.OK);
    }

    }

