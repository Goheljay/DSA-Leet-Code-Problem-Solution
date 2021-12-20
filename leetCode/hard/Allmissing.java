package com.jay.leetCode.hard;

import com.jay.practice.MinNumber;

public class Allmissing {
    public static void main(String[] args) {
        int arr[] = {1,2,0};
        int ans = fisrtPositive(arr);
        System.out.println(ans);

    }
    static int fisrtPositive(int arr[]){
        int min = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i]<= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
        }

        for (int index = 0; index<arr.length; index++){
            if (arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static  void swap(int arr[],int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
