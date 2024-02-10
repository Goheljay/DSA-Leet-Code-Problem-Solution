package com.jay.practice;

import java.util.Arrays;

public class CycleSrt {
    public static void main(String[] args) {
        int arr[] = {3,5,1,2,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycle(int arr[]){
        for (int i=0; i< arr.length; i++){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }

        }
    }
    static  void swap(int arr[], int first, int second){
        int tep = arr[first];
        arr[first] = arr[second];
        arr[second] = tep;

    }
}
