package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class MaximumProductThreeNumbers {
    public static void main(String[] args) {

    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int a = nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];

        int b = nums[0]*nums[1]*nums[2];

        int c = nums[0]*nums[1]*nums[nums.length-1];

        int ans = a;

        if(b > c && b > a){
            ans = b;
        }else if(c > a && c > b){
            ans = c;
        }

        return ans;
    }
}
