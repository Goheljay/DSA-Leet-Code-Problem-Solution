package com.jay.practice;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {2,1,9,3,4,5};
        quickSort(arr, 0, arr.length);
    }

    static void quickSort(int [] arr, int low, int high){

        if (low<high){
            int pivot = partitionArray(arr, low, high);
            quickSort(arr,low, pivot);
            quickSort(arr,pivot+1, high);
        }

    }

    static int partitionArray(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i<=pivot) i++;
            while ( j > pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr,j, low);
        return j;
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = arr[temp];
    }
}
