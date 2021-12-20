package com.jay.leetCode.easy;

public class Sqrtfun {
    public static void main(String[] args) {
        System.out.println(mySqrt(49));

    }
    static int mySqrt(int x) {
        int a = 0;
        while (a*a < x){
            a++;
        }
        return a;

    }

    static int mysqrtBS(int x){
        long start =0, end = Integer.MAX_VALUE, sum=0;

        while (start<= end){
            long mid = start+(end-start)/2;
            if (mid*mid < x){
                sum = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return Math.toIntExact(sum);
    }
}
