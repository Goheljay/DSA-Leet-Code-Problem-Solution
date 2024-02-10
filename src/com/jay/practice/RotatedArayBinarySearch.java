package com.jay.practice;

public class RotatedArayBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1};
        boolean search = search(arr, 0);
        System.out.println(search);
    }
    public static boolean search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while(l <= r) {
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[l] <= arr[mid]){
                if(target >= arr[l] && target < arr[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else {
                if(target <= arr[r] && target > arr[mid]) {
                    l = mid+1;
                } else {
                    r = mid -1;
                }

            }
        }
        return false;

    }
}
