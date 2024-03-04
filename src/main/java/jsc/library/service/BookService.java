package jsc.library.service;

import jsc.library.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public void deleteBookById(Integer id){
        books = new ArrayList<>(books.stream()
                .filter(book -> book.getId() != id)
                .collect(Collectors.toList()));
        System.out.println("Book successfully deleted");
    }

    public void updateBook(Book newBook){

    }

}

