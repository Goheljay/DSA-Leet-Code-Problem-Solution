package com.jay.practice;

import java.util.Arrays;

public class SelectionSrt {
	public static void main(String[] args) {
		int  arr[]= {-4,5,0,1,3,2};
//		selection(arr);
//		System.out.println(Arrays.toString(arr));

		selectionSortAlgo(arr);
		System.out.println(Arrays.toString(arr));

	}

	//selection sort self
	static void selectionSortAlgo(int arr[]) {
		for (int i = 0; i< arr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i){
				swap(arr, min, i);
			}
		}
	}

	static void selection(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
//			find max value and stored in last position in array
			int last = arr.length - i - 1;
			int maxVal = getMaxVal(arr, 0, last);
			swap(arr, maxVal, last);
		}
	}
	
	static void swap(int[] arr, int fisrt, int second) {
		int temp = arr[fisrt];
		arr[fisrt] = arr[second];
		arr[second] = temp;
	}
	
	static int getMaxVal(int arr[], int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
	
	
}
