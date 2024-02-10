package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        //without stream
//        List<EletronicsProducts> eleProducts = new ArrayList<>();
//        for (EletronicsProducts products : getProducts()){
//            if (products.getPrice() < 10000){
//                eleProducts.add(products);
//            }
//        }
//        for (EletronicsProducts pro: eleProducts) {
//            System.out.println(pro.getId()+pro.getName()+pro.getPrice());
//        }

        //with stream

        List<EletronicsProducts> colletionsPro = getProducts().stream().filter(product -> product.getPrice() < 10000).collect(Collectors.toList());
        for (EletronicsProducts productsList: colletionsPro) {
            System.out.println(productsList.getId()+productsList.getName()+ productsList.getPrice());
        }



    }
    private static List<EletronicsProducts> getProducts(){
        List<EletronicsProducts> elepro = new ArrayList<>();
        elepro.add(new EletronicsProducts(1,"Laptop",30000));
        elepro.add(new EletronicsProducts(2,"Mobile", 15000));
        elepro.add(new EletronicsProducts(3,"Hair Drier", 1200));
        elepro.add(new EletronicsProducts(4,"PowerBank",5000));
        elepro.add(new EletronicsProducts(5,"Earphone",10000));

        return elepro;
    }
}

class EletronicsProducts{
    private int id;
    private String name;
    private int price;

    public EletronicsProducts(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}