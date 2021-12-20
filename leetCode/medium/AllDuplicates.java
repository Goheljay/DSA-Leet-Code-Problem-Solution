package com.jay.leetCode.medium;

import java.util.ArrayList;
import java.util.List;

//Cycle Sort
public class AllDuplicates {
    public static void main(String[] args) {

    }

    static List<Integer> findAllDuplicat(int arr[]){
        for (int i=0; i< arr.length; i++){

            if (arr[i] != i+1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    i++;
                }

            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index<arr.length; index++){
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
    return ans;
    }
    static  void swap(int arr[], int first, int second){
        int tep = arr[first];
        arr[first] = arr[second];
        arr[second] = tep;

    }

}
