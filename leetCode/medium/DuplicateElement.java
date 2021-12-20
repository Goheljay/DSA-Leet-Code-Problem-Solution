package com.jay.leetCode.medium;

import java.util.Arrays;

//Cycle Element
public class DuplicateElement {
    public static void main(String[] args) {
        int arr []= {1,3,4,2,2};
        System.out.println(findDuplicat(arr));

    }
    static int findDuplicat(int arr[]){
        for (int i=0; i< arr.length; i++){

            if (arr[i] != i+1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static  void swap(int arr[], int first, int second){
        int tep = arr[first];
        arr[first] = arr[second];
        arr[second] = tep;

    }
}
