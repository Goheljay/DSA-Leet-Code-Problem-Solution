package com.jay.recursion;

public class sortedUnSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        boolean finalans = SortUnsort(arr, arr[1]);
        if (finalans){
            System.out.println("Sorted");
        }else {
            System.out.println("Unsorted");
        }
    }

    static boolean SortUnsort(int arr[], int index){

        //base case
        if (index >= arr.length){
            return true;
        }
        if (arr[index]<arr[index-1]){
            return false;
        }

        //value call
        boolean ans = SortUnsort(arr, index+1);

        //value return
        return ans;
    }
}
