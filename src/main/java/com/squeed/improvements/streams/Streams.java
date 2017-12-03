package com.squeed.improvements.streams;

import java.util.List;
import java.util.stream.IntStream;

public class Streams {

    public void stream() {
        List<Integer> integers = List.of(1, 1, 1, 2, 3, 4, 5, 5, 5, 6);
        System.out.println(integers.stream().takeWhile(i -> i < 5).mapToInt(Integer::valueOf).sum());
        System.out.println(integers.stream().dropWhile(i -> i < 5).mapToInt(Integer::valueOf).sum());
        IntStream.iterate(0, i -> i < 100, i -> i+2).forEach(System.out::println);

        for(int i = 0; i < 100; i+=2) {
            System.out.println(i);
        }
    }
}
