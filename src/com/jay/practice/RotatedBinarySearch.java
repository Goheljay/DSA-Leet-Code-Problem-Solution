package com.jay.practice;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {4,5,6,0,1,2,3};
        System.out.println(findPivot(arr));

    }
    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }

        }
        return -1;

    }
}
