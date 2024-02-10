package com.jay.leetCode.easy.Arrays;

import java.util.*;

public class containsDuplicateValue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,5};
        boolean b = containsDuplicateUsingList(arr);
        System.out.println(b);
    }
    static boolean containsDuplicate(int[] nums) {
        int maxValue = Integer.MAX_VALUE;
        boolean op = false;
        int pist = 0;
        Set<Integer> number =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < maxValue ) {
                maxValue = nums[i];
            }
            if (number.contains(nums[i])) {

            }
            number.add(nums[i]);

        }
        return op;
    }

    static boolean containsDuplicateUsingList(int[] nums) {
        Set<Integer> number =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (number.contains(nums[i])) {
                return true;
            }
            number.add(nums[i] );
        }
        return false;
    }
}
