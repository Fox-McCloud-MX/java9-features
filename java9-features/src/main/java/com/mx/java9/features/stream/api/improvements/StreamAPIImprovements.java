package com.mx.java9.features.stream.api.improvements;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovements {

    public void takeWhile() {
        List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

        List<String> subset1 = alphabets
                .stream()
                .takeWhile(s -> !s.equals("d"))
                .collect(Collectors.toList());

        System.out.println(subset1); //[a, b, c]
    }

    public void dropWhile() {
        List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

        List<String> subset2 = alphabets
                .stream()
                .dropWhile(s -> !s.equals("d"))
                .collect(Collectors.toList());

        System.out.println(subset2); //[d, e, f, g, h, i]
    }

    public void iterate() {
        /* Java 8
        List<Integer> numbers = Stream.iterate(1, i -> i+1)
                            .limit(10)
                            .collect(Collectors.toList());
        */

        List<Integer> numbers = Stream.iterate(1, i -> i <= 10 , i -> i+1)
                .collect(Collectors.toList());

        System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    public void ofNullable() {
        Stream<String> stream = Stream.ofNullable("123");
        System.out.println(stream.count()); //1

        stream = Stream.ofNullable(null);
        System.out.println(stream.count()); //0
    }
}
