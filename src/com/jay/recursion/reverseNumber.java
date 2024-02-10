package com.jay.recursion;

public class reverseNumber {
    public static void main(String[] args) {
        reverse(125);
    }
    static void reverse(int n){
        //base case
        if (n == 0){
            return;
        }

        //value call
        reverse(n%10);

        //value return
        System.out.println(n);
    }
}
