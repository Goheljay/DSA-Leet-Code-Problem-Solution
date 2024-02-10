package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayLists {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9);


        List <Integer> listEven = new ArrayList<>();
        //without stream
        for (int even: list1) {
            if (even%2 == 0){
               listEven.add(even);
            }
        }
        System.out.println("List Even "+listEven);

        //with stream find even number
        Stream<Integer> stream = listEven.stream();
        //List<Integer> list = stream.filter(ans-> ans%2==0).collect(Collectors.toList());
        List <Integer> list = list1.stream().filter(even -> even%2 == 0).collect(Collectors.toList());
        System.out.println("using  stram "+list);

        //find Larger than 5
        List<Integer> grater = list2.stream().filter(larger -> larger > 4).collect(Collectors.toList());
        System.out.println(grater);

        //more customize above line
        list2.stream().filter(larger-> larger > 4).forEach(System.out::print);
    }

}
