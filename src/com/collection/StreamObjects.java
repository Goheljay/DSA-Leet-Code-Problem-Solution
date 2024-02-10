package com.collection;

import java.util.*;
import java.util.stream.Collectors;

public class StreamObjects {
    public static void main(String[] args) {
        String[] name = {"Jay", "Nisarg", "Jayesh", "Raj"};
        Arrays.stream(name).filter(e-> e.startsWith("R")).forEach(s -> System.out.println(s));

        List<String> list = List.of("Jay", "Nisarg", "Jayesh", "Raj");
        List<String> names = list.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList());
        System.out.println(names);

        List<Integer> numbers = List.of(20,5,5,6,8,0,656,12,4);
        numbers.stream().sorted().forEach(System.out::println);

        //find minimum from above list
        Integer minVal = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("minimum value "+minVal);

        Integer maxVal = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("maximum value "+maxVal);
    }
}
