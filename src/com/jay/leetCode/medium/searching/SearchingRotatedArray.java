package com.jay.leetCode.medium.searching;

public class SearchingRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(arr, target));

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (nums[pivot] == target){
            return pivot;
        }
        if (pivot == -1){
            return binrySearch(nums, target, 0,nums.length-1);
        }
        if (target >= nums[0]){
            return binrySearch(nums, target, 0,pivot-1);
        }
        return binrySearch(nums,target,pivot+1,nums.length-1);
    }

    public static int binrySearch(int [] arr,int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] < target){
                start = mid+1;
            }else if (arr[mid] > target){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;
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
