package com.jay.recursion;

public class exponentFind {
    public static void main(String[] args) {

        System.out.println(exponent(5, 2));
    }

    static int exponent(int n, int expo){

        //base case
        if (n == 0){
            return 1;
        }

        //value call
        int ans = expo * exponent(n-1, expo);

        //value return
        return ans;
    }
}
