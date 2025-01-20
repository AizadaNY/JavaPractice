package org.example.week11;

import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args)
    {


        List<Integer > numbers = Arrays.asList(11,12,15,23,76,12,10);

        numbers.forEach(System.out::println);

        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());


    }
}
