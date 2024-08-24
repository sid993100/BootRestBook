package com.sid993100.BootRestBook.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;

//   ---------------genrate getter and setter-----------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    -------------generate constructor-------------
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
//------------------default constructor------------------
    public Book() {
    }

    //    -----------------generate toString--------------
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
