package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));

    }
    public static int thirdMax(int[] nums) {
        long n1 = Long.MIN_VALUE;
        long n2 = Long.MIN_VALUE;
        long n3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i == n1 || i == n2 || 1 == n3){
                continue;
            }
            if (i >= n1){
                n3 = n2;
                n2 = n1;
                n1 = i;
            }else if (i >= n2){
                n3 = n2;
                n2 = i;
            }else if (i >= n3){
                n3 = i;
            }
        }
        if (n3 != Long.MIN_VALUE){
            return (int)n3;
        }else if (n1 != Long.MIN_VALUE){
            return (int)n1;
        }
        else{
            return (int)n2;
        }

    }
}
