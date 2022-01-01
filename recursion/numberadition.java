package com.jay.recursion;

public class numberadition {
    public static void main(String[] args) {
        System.out.println(addition(1342));
    }
    static int addition(int n){
        //base case
        if (n == 0){
            return 0;
        }
        //Recursive call
        return (n%10)+addition(n/10);


    }
}
