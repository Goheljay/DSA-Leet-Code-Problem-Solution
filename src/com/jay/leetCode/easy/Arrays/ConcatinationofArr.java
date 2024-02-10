package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class ConcatinationofArr {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int ans[] =concatArr(arr);
		
		System.out.println(Arrays.toString(ans));
		
	}
	static int[] concatArr(int arr[]) {
		int ans = arr.length;
		int space[] = new int[ans*2];
		for(int i=0; i < ans; i++) {
			space[i] = arr[i];
			space[i+ans] = arr[i];
		}
		return space;
	}
}
