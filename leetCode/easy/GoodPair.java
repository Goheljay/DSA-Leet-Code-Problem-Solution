package com.jay.leetCode.easy;

public class GoodPair {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);

    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]){
                    count++;
                }
            }
        }

        return count;

    }
}
