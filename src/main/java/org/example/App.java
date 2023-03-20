package org.example;

/**
 create a small application that mimics a library catalog.                                          //Library
 There are 3 separate Book properties in the LibraryCatalog.                                        //Book & Library
 It needs to be able to add the 3 books, delete any of the books
 (set it to null) and list all the books (one by one).                                              //add book , delete book, list book
 Books are of two kinds: novels and art albums.                                                     //Novel & ArtAlbum
 They both have a name and number of pages.                                                         //book name & number of pages
 Novels have type (like mystery, sf, etc.) while albums have paper quality.                         //type & paper quality
 Model these entities (book, novel, album) with different classes and inheritance.

 Library:  has 3 Book
 Books: Novel & ArtAlbum
 Common and specific properties
 Actions: add book, delete book, list books

 */
public class App 
{
    public static void main( String[] args )
    {
       Library myLibrary = new Library();

       Novel firstBook = new Novel();
       firstBook.name = "Name of the wind ";
       firstBook.numberOfPages = 661;
       firstBook.type = "Fantasy";

        Book secondBook = new Novel();
        secondBook.name = "Dune ";
        secondBook.numberOfPages = 412;
        firstBook.type = "scifi";

        ArtAlbum thirdBook = new ArtAlbum();
        thirdBook.name = "VanGogh ";
        thirdBook.numberOfPages = 88;
        thirdBook.setPaperQuality ("good");


        myLibrary.addBook (firstBook);
        myLibrary.addBook (secondBook);
        myLibrary.addBook (thirdBook);


        myLibrary.listAllBooks();


    }

}
