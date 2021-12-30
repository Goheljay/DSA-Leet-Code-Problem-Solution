package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int []arr ={1,2,3,4};
        int ans[] = productExceptSelf2(arr);
        System.out.println(Arrays.toString(ans));
    }

    //Bruteforce Approach
//    static int[] productExceptSelf(int[] nums) {
//        int [] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int value = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j){
//                    continue;
//                }
//                value = value*nums[j];
//
//            }
//            ans[i] = value;
//
//        }
//        return ans;
//    }

    //Optimized Approach
    static int[] productExceptSelf(int[] nums) {

        int zeroCount = 0;
        int multipy = 1;

        int n =nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zeroCount++;
            }else {
                multipy = multipy*nums[i];
            }
        }

        if (zeroCount == 0){
            for (int i = 0; i < n; i++) {
                nums[i] = multipy/nums[i];
            }
        }else if (zeroCount == 1){
            for (int i = 0; i<n; i++){
                if (nums[i] == 0){
                    nums[i] = multipy;
                }else {
                    nums[i] = 0;
                }
            }
        }else {
            for (int i = 0; i < n; i++) {
                nums[i] =0;
            }
        }
        return nums;
    }

    //Prefix and Postfix Approach 1
    static  int[] productExceptSelf1(int[] nums){
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];
        int ans[] = new int[nums.length];
        int value = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = value;
            value = value*nums[i];
        }
        int newVale =1;
        for (int i = nums.length-1; i < nums.length; i--) {
            if (i == -1){
                break;
            }
            suffix[i] = newVale;
            newVale = newVale*nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    //Prefix and Postfix Approach 2
    static  int[] productExceptSelf2(int[] nums){

        int ans[] = new int[nums.length];
        int value = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = value;
            value = value*nums[i];
        }
        int newVale =1;
        for (int i = nums.length-1; i < nums.length; i--) {
            if (i == -1){
                break;
            }
            ans[i] = newVale*ans[i];
            newVale = newVale*nums[i];
        }


        return ans;
    }
}
