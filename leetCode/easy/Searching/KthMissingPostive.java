package com.jay.leetCode.easy.Searching;

import java.util.Arrays;

public class KthMissingPostive {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println(Arrays.toString(findKthPositive(arr,k)));
    }
    public static boolean[] findKthPositive(int[] arr, int k) {
        boolean newArr [] = new boolean[1000];

        for (int i = 0; i < arr.length;i++){
            if (i+1 == arr[i]){
                newArr[i] = true;
            }else {
                newArr[i] = false;
            }
        }
        return newArr;
    }
}
