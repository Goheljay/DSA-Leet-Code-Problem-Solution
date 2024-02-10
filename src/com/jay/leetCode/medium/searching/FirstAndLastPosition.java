package com.jay.leetCode.medium.searching;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(BSsearchRange(arr,target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]  == target){
                start = i;
                break;
            }else {
                start = -1;
            }
        }
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == target){
                end = i;
                break;
            }else {
                end = -1;
            }
        }
        return new int[]{start,end};
    }
    public static int[] BSsearchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int [] ans = {-1,-1};
        //First Binary searching
        while (s<=e){
            int mid = s+(e-s)/2;
            if (nums[mid] == target){
                ans[0]= mid;
                e =mid-1;
            }else if (nums[mid] < target){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }

        s= 0;
        e = nums.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (nums[mid] == target){
                ans[1]= mid;
                s =mid+1;
            }else if (nums[mid] < target){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        return ans;
    }
}
