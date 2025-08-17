package service;

import model.Book;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BookService {

    private static Map<String, Book> books = new HashMap<>();


    public Book addInfo() {
        Book newBook = new Book();
        newBook.setId(UUID.randomUUID().toString());
        newBook.setTitle("Panda");
        newBook.setPrice(100d);
        newBook.setAuthor("Jo Joo");
        newBook.setPublisher("Fairy tail");
        newBook.setPublishDate(LocalDate.parse("2011-12-03"));

        books.put(newBook.getId(), newBook);
        System.out.println(newBook.getId());
        System.out.println("Added new book");

        return newBook;
    }


    public Book displayInfo(String id) {

        Book book = books.get(id);
        System.out.println("Book no :: " + book.getId());

        return book;
    }


}
