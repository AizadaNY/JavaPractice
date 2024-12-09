package org.example.week10;

public class MultiThreadedCacheTest {

    public static void main(String[] args) {

        Cache cache = new Cache();

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "Key-" + i;
                String value = "Value-" + i;
                cache.put(key, value);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                String key = "Key-" + i;
                String value = cache.get(key);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread writer1 = new Thread(writer, " Writer-1");
        Thread writer2 = new Thread(writer, " Writer-2");
        Thread reader1 = new Thread(reader, " Reader-1");
        Thread reader2 = new Thread(reader, " Reader-2");

        try {
            writer1.start();
            writer2.start();
            reader1.join();
            reader1.join();
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Cache operations completed.");

    }

}
