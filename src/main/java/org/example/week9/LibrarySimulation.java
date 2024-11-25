package org.example.week9;

public class LibrarySimulation {

    public static void main(String[] args) {
        Library library = new Library();
        String[] bookTitles = {"Java", "CS", "Python", "Data Structure", "Database System", "Coding"};

        for (int i = 0; i < bookTitles.length; i++) {
            library.addBook(new Book(i + 1, bookTitles[i], "Author " + (i + 1)));
        }

        Thread user1=new Thread(new User(library, bookTitles),"User1");
        Thread user2=new Thread(new User(library, bookTitles),"User2");
        Thread user3=new Thread(new User(library, bookTitles),"User3");

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        }catch (InterruptedException exception){
            System.out.println("Main thread interrupted");
        }

        library.displayAvailableBooks();
    }
}
