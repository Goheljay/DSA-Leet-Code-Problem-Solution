package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] newArr = new int[]{nums1.length+nums2.length};
        for (int i  = 0; i<nums1.length; i++){
            newArr[i] = nums1[i];
        }
        for (int i = nums1.length; i < nums2.length; i++){
            newArr[i] = nums2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
