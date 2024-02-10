package com.jay.practice;

public class MinNumber {
	public static void main(String[] args) {
		int arr[]= {18, 12, -7, 3, 14, 28};
//		int target= 12;
		
		System.out.println("Min Value "+Min(arr));
		System.out.println("Max value in range "+Min1(arr,1,4));
		System.out.println("Max Value "+Max(arr));
		System.out.println("Max value in range "+Max1(arr,1,4));

	}
	
	static int Min(int arr[]) {
		int minVal = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<minVal) {
				minVal =  arr[i];
			}	
		}
		return minVal;
	}
	
	static int Max(int arr[]) {
		int maxVal = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]> maxVal) {
				maxVal =  arr[i];
			}	
		}
		return maxVal;
	}
	
	static int Max1(int arr[], int start, int end) {
		int maxVal = Integer.MIN_VALUE;
		for(int i = start; i < end; i++) {
			if (arr[i]> maxVal) {
				maxVal =  arr[i];
			}	
		}
		return maxVal;
	}

	static int Min1(int arr[], int start, int end) {
		int maxVal = Integer.MAX_VALUE;
		for(int i = start; i < end; i++) {
			if (arr[i] < maxVal) {
				maxVal =  arr[i];
			}	
		}
		return maxVal;
	}
}
