package org.example.week10;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


public class SafeCounter {

    private int count;
    private static final ReentrantLock lock = new ReentrantLock();

    public void increment(int quantity) {
        lock.lock();
        try {
            count += quantity;
            System.out.println(Thread.currentThread().getName() +
                    "  added count. Current count: " + count);
        } finally {
            lock.unlock();
        }
    }

    public void decrement(int quantity) {
        lock.lock();
        try {
            if (count > quantity) {
                count -= quantity;
                System.out.println(Thread.currentThread().getName() +
                        "  removed count. Current count: " + count);
            } else {
                System.out.println("Insufficient quantity " + quantity);
            }
        } finally {
            lock.unlock();
        }
    }

    public int getValue() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }

    public int getRandomNum(){
        Random random=new Random();
        return random.nextInt(100);
    }
}
