package com.jay.recursion;

public class febonacciNum {
    public static void main(String[] args) {
        System.out.println(febonacci(50));
    }

    static int febonacci(int n){

        //base case
        if (n == 0 || n == 1){
            return n;
        }

        //value call
        int ans = febonacci(n-1)+febonacci(n-2);

        //value return
        return ans;
    }
}
