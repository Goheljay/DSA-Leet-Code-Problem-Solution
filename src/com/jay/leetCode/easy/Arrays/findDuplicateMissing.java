package com.jay.leetCode.easy.Arrays;


import java.util.Arrays;

public class findDuplicateMissing {
    public static void main(String[] args) {
        int arr[]= {1,2,2,4,5};
        int ans[] = setValue(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] setValue(int arr[]){
        for (int i = 0; i< arr.length; i++){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
        }

        for (int index = 0; index<arr.length; index++){
            if (arr[index] != index+1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

