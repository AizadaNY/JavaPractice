package org.example.week6.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Create a generic sorting algorithm (e.g. quicksort) that can sort lists of various data types,
 * allowing users to specify a custom comparator to define the sorting order. The algorithm
 * should be efficient and handle different edge cases
 *
 * public static <T> void sort(List<T> list, Comparator<T> comparator) {
 * // TODO: implement
 * }
 * public static void main(String[] args) {
 * List<Integer> intList = new ArrayList<>();
 * intList.add(3);
 * intList.add(1);
 * intList.add(4);
 * intList.add(2);
 * // Sort by natural order
 * sort(intList, Comparator.naturalOrder());
 * System.out.println("Sorted integer list: " + intList);
 * List<String> stringList = new ArrayList<>();
 * stringList.add("Charlie");
 * stringList.add("Alice");
 * stringList.add("Bob");
 * // Sort by custom comparator (e.g., descending order)
 * sort(stringList, Comparator.comparing(String::length).reversed());
 * System.out.println("Sorted string list (descending order): " + stringList);
 * }
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(1);
        intList.add(7);
        sort(intList, Comparator.naturalOrder());
        System.out.println(intList);


        List<String> stringList = new ArrayList<>();
        stringList.add("Charlie");
        stringList.add("Alice");
        stringList.add("Bob");
        sort(stringList,Comparator.comparing(String::length));
        System.out.println(stringList);

    }

    public static <T> void sort(List<T> list, Comparator<T> comparator){
        list.sort(comparator);
    }
}
