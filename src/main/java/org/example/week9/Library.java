package org.example.week9;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }



}
