package com.jay.geeksforgeeks.array;

import java.util.Scanner;

public class RemoveDupicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t --> 0 ){
            int n;
            n = sc.nextInt();
            int arr[] = new int [n];
            for (int i=0; i < n; i++){
                arr[i]=sc.nextInt();
            }
            int data = removeDuplicate(n, arr);
            for (int i=0; i<data; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println("");

        }
    }

    private static int removeDuplicate(int n, int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
