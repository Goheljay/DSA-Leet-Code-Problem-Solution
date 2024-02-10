package com.jay.leetCode.easy.Searching;

public class FindSubsetSumEqualsTarget {
    public static void main(String[] args) {

        int [] arr = {4, 1, 8, 7};
        int target = 3;
        System.out.println(findSubsetAndTarget(arr, target));

    }
    static boolean findSubsetAndTarget(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arr[i]-arr[j]) == target){
                    return true;
                } else return false;
            }
        }
        return false;
    }
}
