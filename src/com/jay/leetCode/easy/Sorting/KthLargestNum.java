package com.jay.leetCode.easy.Sorting;

public class KthLargestNum {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        return findKthElement(nums, 0, nums.length-1 , nums.length-k);
    }
    public int findKthElement(int arr[], int start, int end , int k){
        //select middle index
        swap((start+end)/2, end, arr);

        int left = start;

        for(int i=start; i<end; i++){
            if(arr[i]< arr[end]){
                swap(i, left, arr);
                left++;
            }
        }

        swap(end,left,arr);

        if(k == left){
            return arr[left];
        }else if(left<k){
            return findKthElement(arr, left+1, end,k);
        }else{
            return findKthElement(arr, start, left-1,k);
        }
    }

    private void swap(int a, int b , int[] arr){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }

}
