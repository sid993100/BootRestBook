package com.sid993100.BootRestBook.controllers;

import com.sid993100.BootRestBook.entities.Book;
import com.sid993100.BootRestBook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }

//  ----------get single book-----------
    @GetMapping("/books/{id}")
    public  Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

// --------------add/post book-----------------
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book b=this.bookService.addBook(book);
        return b;
    }
}
