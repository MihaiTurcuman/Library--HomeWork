package org.example;

import java.awt.print.Book;

public class Library extends Object {

    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book) {
        if (book1 == null) {
            this.book1 = book;
            return;
        }
        if (book2 == null) {
            this.book2 = book;
            return;
        }
        if (book3 == null) {
            this.book3 = book;
            return;
        }
        System.out.println ("Library is full");
    }

    public void listAllBooks() {
        System.out.println ("book1: " + book1);
        System.out.println ("book2: " + book2);
        System.out.println ("book3: " + book3);
    }



}


