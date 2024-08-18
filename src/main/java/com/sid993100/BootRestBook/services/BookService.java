package com.sid993100.BootRestBook.services;

import com.sid993100.BootRestBook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private static List<Book> listOfBook=new ArrayList<>();

    static {
        listOfBook.add(new Book(1,"Java", "This is java book."));
        listOfBook.add(new Book(2,"Java2", "This is java book2."));
        listOfBook.add(new Book(3,"Java3", "This is java book3."));
    }

//    -------------------------now we create method--------------------
//    get all books
    public List<Book> getAllBooks(){
        return listOfBook;
    }
//    get single book by id
    public Book getBookById(int id){
        Book book=null;
        book=listOfBook.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

//--------------create add method------------
    public Book addBook(Book book){
        return book;
    }

}
