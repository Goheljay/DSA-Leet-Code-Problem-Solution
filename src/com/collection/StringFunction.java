package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringFunction {
    public static void main(String[] args) {
        List<product> productList = new ArrayList<product>();
        productList.add(new product(4, "Iphone",30000));
        productList.add(new product(2,"Samsung",20000));
        productList.add(new product(3,"Nokia",10000));
        productList.add(new product(1,"Sony",15000));
        productList.add(new product(5,"HTC",12000));

        Collections.sort(productList,Comparator.comparingInt(p-> p.price));
        for (product value : productList){
            System.out.println(value.id +" "+ value.name+" "+ value.price);
        }

    }
}

class product{
    int id;
    String name;
    int price;

    public product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}