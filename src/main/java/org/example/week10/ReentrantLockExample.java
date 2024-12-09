package org.example.week10;

public class ReentrantLockExample {
    public static void main(String[] args) {
        SafeCounter safeCounter=new SafeCounter();
        Runnable addCount = () -> safeCounter.increment(13);
        Runnable removeCount = () -> safeCounter.decrement(4);

        Thread t1 = new Thread(addCount);
        Thread t2 = new Thread(removeCount);
        Thread t3 = new Thread(removeCount);
        t1.start();
        t2.start();
        t3.start();
    }
}
