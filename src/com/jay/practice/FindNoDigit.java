package com.jay.practice;

public class FindNoDigit {
    public static void main(String[] args) {
        int n = 2202;
        int b = 2;

        //if you write the base in log than divde the logn using log base.
        int ans = (int)(Math.log(n) / Math.log(b))+1;
        System.out.println(ans);

    }
}
