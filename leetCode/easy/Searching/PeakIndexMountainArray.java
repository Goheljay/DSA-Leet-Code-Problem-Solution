package com.jay.leetCode.easy.Searching;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,10,9,5};
        System.out.println(peakIndexInMountainArray1(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int num = Integer.MIN_VALUE;
        int numPosition = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > num){
                num = arr[i];
                numPosition = i;
            }
        }
        return numPosition;
    }
    public static int peakIndexInMountainArray1(int[] arr) {
        int start =0;
        int end = arr.length;
        while (start < end){
            int mid = start+(end-start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return  start;
    }

}
