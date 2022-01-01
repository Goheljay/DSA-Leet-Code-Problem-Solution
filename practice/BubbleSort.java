package com.jay.practice;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {3,4,0,4,9,2,1};
		simpleBubble(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void simpleBubble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

	}
}
