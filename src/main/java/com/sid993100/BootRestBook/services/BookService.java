package com.sid993100.BootRestBook.services;

import com.sid993100.BootRestBook.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //    ----------------create delete method---------------
//    here we filter all the data which not equal to bid to get the filtered data and if i want to delete specific data then use foreach method
    public void deleteBook(int bid){
        listOfBook=listOfBook.stream().filter(book->{
            if(book.getId()!=bid){
                return true;
            }else{
                return false;
            }
        }).collect(Collectors.toList());

//        we can do this in single line also
//        listOfBook=listOfBook.stream().filter(book -> book.getId()!=bid).collect(Collectors.toList());
    }

//    public void updateBook() {
//    }

    public void updateBook(Book book, int bookId) {
        listOfBook=listOfBook.stream().map(b ->{
            if(b.getId()==bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
                return b;
        }).collect(Collectors.toList());

    }
}
