package org.example.week10;

import java.util.Random;

public class SafeCounterTest {

    public static void main(String[] args) {

        SafeCounter safeCounter = new SafeCounter();

        Thread incrementThread = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                safeCounter.increment(safeCounter.getRandomNum());
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 1; i <= 13; i++) {
                safeCounter.decrement(safeCounter.getRandomNum());
            }
        });

        //starts the thread
        incrementThread.start();
        decrementThread.start();

        //wait for both threads to finish
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }

        System.out.println("Final counter value  "+ safeCounter.getValue() );

    }


}
