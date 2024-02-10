package com.jay.leetCode.medium.searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int tar = 4;
        System.out.println(searchInsert(arr, tar));

    }
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while (s <= e) {

            int mid = s+(e-s)/2;
            if (target == nums[mid]){
                return mid;
            }
            else if (nums[mid] < target){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        return s;
    }
}
