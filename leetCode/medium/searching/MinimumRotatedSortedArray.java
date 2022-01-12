package com.jay.leetCode.medium.searching;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
       int ans = findMin(arr);
        System.out.println(ans);

    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if (start < mid && nums[mid] < nums[mid-1]){
                return nums[mid+2];
            }
            if (nums[start] >= nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return nums[0];

    }
}
