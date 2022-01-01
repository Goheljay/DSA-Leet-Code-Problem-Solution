package com.jay.practice;

public class CircularArrayRotationCount {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,7,0,1,2};
		
		System.out.println(findRotation(arr));
	}
	
	static int findRotation(int arr[]) {
		int pivot = findPivot(arr);
		return pivot+1;
	}
	
//	find  the pivot element and +1 in pivot element
	static int findPivot(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			if (mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid-1]) {
				return mid - 1;
			}
			if(arr[mid] <= arr[start]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	
}
