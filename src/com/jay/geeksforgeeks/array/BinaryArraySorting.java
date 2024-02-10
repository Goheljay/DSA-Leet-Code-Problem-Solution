package com.jay.geeksforgeeks.array;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int arr[] = {1,0,1 ,1, 1, 1, 1, 0, 0, 0};
        int n = 10;
        int [] ans = SortBinaryArray(arr,n);
        System.out.println(Arrays.toString(ans));

    }
    static int[] SortBinaryArray(int arr[], int n)
    {
        // code here
        int [] newarr = new int[n];
        int count =0, twocount=0;
        for (int i = 0; i< n ; i++){
            if (arr[i] == 0){
                count++;
            }else {
                twocount++;
            }
        }
        for (int i = 0; i<count; i++){
            newarr[i] = 0;
        }
        for (int i = count; i < twocount+count; i++){
            newarr[i] = 1;
        }
        return newarr;

    }
}
