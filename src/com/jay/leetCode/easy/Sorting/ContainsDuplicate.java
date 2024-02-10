package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {3,3};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
