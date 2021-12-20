package com.jay.leetCode.easy;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int ans [] = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = target.length-1; j > index[i] ; j--) {
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];

        }
        return target;
    }
}
