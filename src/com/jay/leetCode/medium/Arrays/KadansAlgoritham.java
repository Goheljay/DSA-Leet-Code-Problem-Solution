package com.jay.leetCode.medium.Arrays;

public class KadansAlgoritham {
    public static void main(String[] args) {
        int [] arr = {-1 -2 -3 -4};
//        int ans =  maxSubArrayAns(arr);
        long newAns = maxSubArraySecondWay(arr);
        System.out.println(newAns);
    }

    private static long maxSubArraySecondWay(int[] nums) {
        int maxSum = nums[0];
        // Initialize the current sum of our subarray as nums[0]...
        int currSum = nums[0];
        // Traverse all the element through the loop...
        for (int i = 1; i < nums.length; i++) {
            // Do sum of elements contigous with curr sum...
            // Compare it with array element to get maximum result...
            currSum = currSum + nums[i];
            if (currSum < nums[i]) {
                currSum =  nums[i];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
           // currSum = Math.max(currSum + nums[i], nums[i]);
            // Compare current sum and max sum.
            //maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    private static int maxSubArrayAns(int[] arr) {
        int  continuesArrayAns = 0;
        int maxSum = 0;
        if (arr.length > 1) {
            for (int a = 0; a < arr.length; a++) {
                continuesArrayAns = continuesArrayAns + arr[a];
                if (continuesArrayAns > maxSum) {
                    maxSum = continuesArrayAns;
                }
            }
            return maxSum;
        }
        return arr[arr.length-1];
    }
}
