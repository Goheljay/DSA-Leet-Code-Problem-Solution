package com.jay.leetCode.easy.Searching;

import java.util.Arrays;

public class FindAbsoluteDiffrence {
    public static void main(String[] args) {
        int a[] = {4, 1, 8, 7};
        int b[] = {2, 3, 6, 5};
        System.out.println(absoulteAdd(a, b));
    }

    static int absoulteAdd(int []arr, int[] arr1) {
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int sum = 0;
        for (int i = 0 ; i <arr.length;  i++) {

            sum = sum+Math.abs(arr[i]-arr1[i]);
        }
        return sum;
    }
}
