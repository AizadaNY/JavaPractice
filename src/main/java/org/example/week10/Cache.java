package org.example.week10;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {

    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + " putting key " + key + " -> " + value);
        cache.put(key, value);
    }

    public String get(String key) {
        String value = cache.get(key);
        System.out.println(Thread.currentThread().getName() + " getting key " + key + " -> " +
                (value != null ? value : "null"));
        return value;
    }



}
