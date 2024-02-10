package com.jay.leetCode.easy.Searching;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int arr[] = {3,24,50,79,88,150,345};
        int tar = 200;
        int[] ans = twoSum(arr,tar);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start<end){

            if (numbers[start]+numbers[end] < target){
                start++;
            }else if (numbers[start]+numbers[end]> target){
                end--;
            }else {
                return new int[]{start+1, end+1};
            }
        }


//        int i = 0, j = 1;
//        while(j<numbers.length){
//            if(numbers[i]+numbers[j] == target){
//                return new int[]{i+1,j+1};
//            }else if(numbers[i]+numbers[j] < target){
//                j++;
//                if (j == numbers.length-1){
//                    i++;
//                }
//            }
//        }
        return numbers;
    }
}
