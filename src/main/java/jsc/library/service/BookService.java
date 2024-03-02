package jsc.library.service;

import jsc.library.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookService {
    ArrayList<Book> books;

    public BookService(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findAllBooks() {
        return books;
    }

    public Optional<Book> findBookById(Integer id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

}

