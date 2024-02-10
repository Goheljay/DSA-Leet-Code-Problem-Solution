package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int[] sum = runningSum(arr);
		System.out.println(Arrays.toString(sum));
		
	}
	static int[] runningSum(int[] nums) {
		int sum = 0;
        int[] sums = new int[nums.length] ;
        for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			
			sums[i] = sum;
		}
        return sums;
    }
}
