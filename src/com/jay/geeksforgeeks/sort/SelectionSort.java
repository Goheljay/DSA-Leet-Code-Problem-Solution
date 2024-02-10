package com.jay.geeksforgeeks.sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [] arr = new int [n];
        for (int i=0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr, n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public static void selectionSort(int [] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j<n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]  = temp;
        }
    }
    static  void swap(int arr[], int first, int second){
        int tep = arr[first];
        arr[first] = arr[second];
        arr[second] = tep;

    }
}
