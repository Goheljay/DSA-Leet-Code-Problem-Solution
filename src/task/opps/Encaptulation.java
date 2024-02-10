package task.opps;

import java.util.Scanner;

public class Encaptulation {
    public static void main(String[] args) {
        Products products = new Products();
        System.out.println("Enter boolean Value");
        Scanner sc = new Scanner(System.in);
        boolean value = sc.nextBoolean();
        products.isAdmin = value;
        products.setId(1);
        products.setName("Ram");
        products.setPrice(30);
        System.out.println(products.getId() +" "+ products.getName() +" "+ products.getPrice());
    }
}

class Products {
    private int id;
    private String name;
    private int price;
    boolean isAdmin;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {

        if (!isAdmin){
            System.out.println("You can not change it.");
        }else {
            this.price = price;
        }
    }
}

