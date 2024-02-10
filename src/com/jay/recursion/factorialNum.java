package com.jay.recursion;

public class factorialNum {
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }

    static int factorial(int n){
        //base condition
        if(n <= 1){
            return 1;
        }
        //value call
        int nextFact = factorial(n-1);
        int ans = n*nextFact;

        //value return
        System.out.println(ans);
        return ans;
    }
}
