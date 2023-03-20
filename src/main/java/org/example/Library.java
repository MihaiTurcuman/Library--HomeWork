package org.example;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library extends Object {

   public List<Book> books = new ArrayList<> ();

   public void addBook(Book book) {
       if (books.size() >=4) {
           System.out.println ("Library is full");
           return;
       }
       books.add(book);
   }

   public void listAllBooks() {

       for (Book book : books) {
           System.out.println(book);
       }
   }

   public void deleteBook(Book book){
     if (books.contains(book)) {
         System.out.println("Book does not exist");
     }

       System.out.println("Deleting book" + book);
       books.remove(book);


  }
}





