package com.jay.geeksforgeeks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,9,7};
        int [] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] reverse(int arr[]){
        int arrSize = arr.length;
        int s = 0;
        int e = arrSize-1;
        for (int i = 0; i<arrSize/2; i++){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}
