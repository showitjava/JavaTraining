package com.Practice;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {
    public static  void main(String agrs[])
    {
        Integer[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 3, 8, 9};

        // Find duplicates using streams
        Set<Integer> duplicates = Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)   // only duplicates
                .map(Map.Entry::getKey)                  // extract the keys (duplicates)
                .collect(Collectors.toSet());            // collect as Set

        System.out.println("Duplicate elements: " + duplicates);

        Optional<Integer> res =Arrays.stream(array)
                .sorted((a,b)->b.compareTo(a))
                .skip(1)
                .limit(1)
                .findFirst();

        System.out.println(res.get());

    }
}
