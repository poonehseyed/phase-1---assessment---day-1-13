package model;

import java.time.LocalDate;
import java.util.List;

public class Library {

    private int number;
    private List<Book> books;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
