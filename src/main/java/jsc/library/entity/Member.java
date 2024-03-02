package jsc.library.entity;

import java.util.ArrayList;

public class Member extends User{
    private ArrayList<Book> books;

    public Member(ArrayList<Book> books) {
        this.books = books;
    }

    public Member(Integer id, String name, String lastName, String email, ArrayList<Book> books) {
        super(id, name, lastName, email);
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Member{" +
                "books=" + books +
                '}';
    }
}
