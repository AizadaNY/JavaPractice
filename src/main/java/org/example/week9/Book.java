package org.example.week9;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public synchronized boolean checkOut(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("Book checked out: "+ title);
            return true;
        }
        System.out.println("Book is not available: "+ title);
        return false;
    }

    public synchronized boolean returnBook(){
        isAvailable=true;
        System.out.println("Book is returned "+ title);
        return true;
    }

    public String getTitle(){
        return title;
    }

    public boolean isAvailable(){
        return isAvailable;
    }


}
