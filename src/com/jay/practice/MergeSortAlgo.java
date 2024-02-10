package com.jay.practice;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int []arr = {9,4,7,6,3,1,5};
        mergeSort(arr,0, arr.length);
    }

    static void mergeSort(int [] arr, int l, int r) {

        if (l < r) {
            int mid = arr.length/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
//            merge(arr, l, mid, r);
            System.out.println(l);
            System.out.println(mid);
            System.out.println(r);
        }

    }

    static void merge(int[] arr, int l, int mid, int r) {

    }
}
