package com.jay.practice;

public class SaerchingRange {
	public static void main(String[] args) {
		int arr[]= {18, 12, -7, 3, 14, 28};
		int target= 1;
		System.err.println(Searching(arr, target, 1, 4));
	}
	
	static int Searching(int arr[], int tar, int start, int end) {
		for(int i=start; i<=end; i++) {
			
			int element = arr[i];
			if (element == tar) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
}
