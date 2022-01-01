package com.jay.practice;

public class CellingBS {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,9,11, 12, 14, 20,36,48};
		int taget = 18;
		System.out.println(ceilingBinary(arr, taget));
	}
	
//	Ceiling = smallest element greatest or equal to target element
//	step 1: find target in array
//	step 2: find all number grater then target
//	step 3:which of the smallest number
	
	static int ceilingBinary(int arr[], int tar) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if (tar == arr[mid]) {
				return mid;
			}else if(arr[mid] > tar) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
		
		}
		return start;
	}
	
}
