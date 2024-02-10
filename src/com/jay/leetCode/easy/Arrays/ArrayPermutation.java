package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class ArrayPermutation {
	public static void main(String[] args) {
		int arr[] = {5,0,1,2,3,4};
		int[] ans = permutation(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] permutation(int arr[]) {
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[arr[i]];
		}
		return ans;
		
	}
}
