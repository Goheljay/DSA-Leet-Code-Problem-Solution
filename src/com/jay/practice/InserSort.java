package com.jay.practice;

import java.util.Arrays;

public class InserSort {
	public static void main(String[] args) {
		int arr[]= {4,5,3,-11,-2};
		Insertionsrt(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Insertionsrt(int arr[]) {
		for(int i = 0; i<arr.length-1; i++) {
			for (int j = i+1; j > 0; j--) {
				if (arr[j]< arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
	}
}
