package com.jay.leetCode.medium.searching;

public class SearchRotatedSortedArrayBoolean {
    public static void main(String[] args) {
        int arr[] = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(arr, target));

    }
    public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);

        if (nums[pivot] == target){
            return true;
        }
        if (pivot == -1){
            return binaryserch(nums, target, 0,nums.length-1);
        }
        if (target >= nums[0]){
            return binaryserch(nums, target, 0,pivot-1);
        }
        return binaryserch(nums,target,pivot+1,nums.length-1);

    }
    static int pivot(int [] nums){
        int start = 0;
        int end = nums.length;
        while(start < end){
            int mid = start+(end-start)/2;

            if(nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if (nums[start] >= nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    static boolean binaryserch(int [] nums, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;

            if (nums[mid] < target){
                start = mid+1;
            }else if (nums[mid] > target){
                end = mid-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
