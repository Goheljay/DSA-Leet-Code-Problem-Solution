package com.jay.recursion;

public class numberEnglishName {
    public static void main(String[] args) {
        String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        divideNumber(432,str);
    }
    static void divideNumber(int n, String str[]){

        //base case
        if (n == 0){
            return;
        }

        //value call
        divideNumber(n/10, str);


        //value print or return
        int ans = n%10;
        System.out.print(str[ans]+" ");


    }
}
