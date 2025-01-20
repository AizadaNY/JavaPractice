package org.example.week11;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;
    private double rating;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }


    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

    }
}


