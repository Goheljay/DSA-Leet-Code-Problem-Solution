package com.jay.geeksforgeeks.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [] arr = new int [n];
        for (int i=0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr, n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int [] arr, int n) {
        for (int i = 0; i <= n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
