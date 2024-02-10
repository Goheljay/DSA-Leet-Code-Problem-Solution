package com.jay.recursion;

public class coningNumber {
    public static void main(String[] args) {
        count(5);

    }
    static void count(int n){
    //base condition
        if (n == 0) {
            return;
        }
    //value print or return
        System.out.println(n);

    //value call
    count(n-1);
    }
}
