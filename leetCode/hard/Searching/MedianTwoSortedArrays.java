package com.jay.leetCode.hard.Searching;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,3,4};
        int [] num2 = {2};
        System.out.println(findMedianSortedArrays(nums1,num2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double [] arr = new double[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int j = 0;j< nums2.length; j++){
            arr[nums1.length] = nums2[j];
        }

        Arrays.sort(arr);

        int mid = (arr.length-1)/2;
        int m, n;
        m = (int) arr[mid];

        if(arr.length > 1)
            n = (int) arr[mid+1];
        else
            n = 0;


        double median = (m+n)/2.0;
        double median1 = m;

        if(arr.length % 2 == 0 && arr.length>0)
            return median;
        else
            return median1;

//        double [] arr = new double[nums1.length + nums2.length];
//
//        for (int i = 0; i < nums1.length; i++) {
//            arr[i] = nums1[i];
//        }
//        for (int j = 0;j< nums2.length; j++){
//            arr[nums1.length] = nums2[j];
//        }
//
//        Arrays.sort(arr);
//
//        if (arr.length%2 != 0){
//            return (double)arr[arr.length / 2];
//        }
//        return (double)(arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0;
    }
}
