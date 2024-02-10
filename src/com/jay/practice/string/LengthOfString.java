package com.jay.practice.string;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String");

        String name = sc.next();

        int length = FindLength(name.toCharArray());
        System.out.println(length);
        reverseString(name.toCharArray());
        reverseStringArra(name.toCharArray());
    }


    public static int FindLength(char[] enteredString){
        int count=0;
        for (int i = 0; i < enteredString.length; i++) {
            char length = enteredString[i];
            count++;
        }

        return count;
    }

    public static void reverseString(char [] reverse){
        String temp = "";
        for (int i = reverse.length-1; i >=0; i--) {
            char ch = reverse[i];
            temp += ch;
        }
        System.out.println(temp);
    }

    public static void reverseStringArra(char [] reverse){
        int s = 0;
        int e = reverse.length-1;
        while (s<e){
            char val = reverse[s];
            reverse[s]  = reverse[e];
            reverse[e] = val;

            s++;
            e--;
            System.out.println(reverse);
        }
    }
}
