package com.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnArrayList {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list.add(1,160);
//        System.out.println(list);

//        Stack<String> animal = new Stack<>();
//        animal.add("Elephant");
//        animal.add("Dog");
//        animal.add("Cow");
//        animal.push("cat");
//        System.out.println(animal);


//        System.out.println(animal.peek());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(22);
//        queue.add(50);
//        queue.offer(20);
//
//
//
//        System.out.println(queue);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

//        Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//
//        pq.offer(40);
//        pq.offer(20);
//        pq.offer(11);
//        pq.offer(50);
//        System.out.println(pq);
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach((n) -> {
//            System.out.println(n);
//        });

        List<String> arr = List.of("Jay", "Nisarg", "Jayesh", "Raj");
        arr.stream().sorted().filter(e -> e.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
