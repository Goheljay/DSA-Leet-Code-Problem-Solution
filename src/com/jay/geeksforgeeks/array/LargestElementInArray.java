package com.jay.geeksforgeeks.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 3, 2, 4, 5};
        int n = 7;
        System.out.println(largest(arr,n));

    }
    public static int largest(int arr[], int n) {
        int largeElement = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largeElement){
                largeElement = arr[i];
            }
        }
        return largeElement;
    }
}
