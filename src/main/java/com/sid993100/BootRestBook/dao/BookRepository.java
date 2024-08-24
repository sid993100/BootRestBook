package com.sid993100.BootRestBook.dao;

import com.sid993100.BootRestBook.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    public Book findById(int id);
}
