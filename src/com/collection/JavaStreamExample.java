package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Prodcut{
    int id;
    String name;
    int price;

    public Prodcut(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        ArrayList <Prodcut> productList = new ArrayList<Prodcut>();

        productList.add(new Prodcut(1,"Laptop",25000));
        productList.add(new Prodcut(2,"Mobile", 10000));
        productList.add(new Prodcut(3,"Lenevo Laptop",28000));

        List<Integer> productList1 = productList.stream()
                .filter((p) -> p.price < 15000)
                .map((p) -> p.price)
                .collect(Collectors.toList());

        System.out.println(productList1);

    }
}
