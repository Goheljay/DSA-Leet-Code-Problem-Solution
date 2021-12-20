package com.jay.leetCode.easy;

import java.util.Arrays;
//Cycle sort
public class MIssingNum {
    public static void main(String[] args) {

        int arr[] = {5,3,0,1,2};
        int ans = missingsrt(arr);
        System.out.println((ans));
    }
    static  int missingsrt(int arr[]){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i, correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = second;
        arr[second] = temp;
    }
}
