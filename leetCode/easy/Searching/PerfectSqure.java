package com.jay.leetCode.easy.Searching;

public class PerfectSqure {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));

    }
    public static boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }

        int start = 0;
        int end = num/2;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(mid*mid == num){
                return true;
            }else if(mid*mid > num){
                end = mid -1;
            }else{
                start = mid + 1;
            }

        }
        return false;
    }
}
