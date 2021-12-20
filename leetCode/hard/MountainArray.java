package com.jay.leetCode.hard;
 
public class MountainArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,3,1};
		int tar = 3;
		
		int ans = findInMountainArray(arr, tar);
		System.out.println(ans);
		
	}
	
	static int findInMountainArray(int arr[], int target) {
		
		int peak = peakIndexInMountainArray(arr);
		
		int findAns = orderAgnostic(arr, target, 0, peak);
			
//		if answer found then goto this if statement and return the answer
		if(findAns != -1) {
			return findAns;
		}
		
//		if answer answer not found in first half try to finding answer in second half
		return orderAgnostic(arr, target, peak+1, arr.length-1);
	}
	
	public static int peakIndexInMountainArray(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start< end) {
			int mid = (start +end)/2;
			if (arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return start;
	}
	
	static int orderAgnostic(int arr[], int tar, int start, int end) {
		
//		find the array ascending or descending
		boolean isAsc; 
		if (arr[start] < arr[end]) {
			isAsc = true;
		}else {
			isAsc = false;
		}
		
//		Now implement simple Binary search
		while(start <= end) {
//			find mid and target same or not
			int mid = (start+end)/2;
			if (arr[mid] == tar) {
				return mid;
			}
			if(isAsc) {
				if (arr[mid] > tar) {
					end = mid-1;
				}else {
					start =mid+1;
				}
			}else {
				if (arr[mid] < tar) {
					end = mid-1;
				}else {
					start =mid+1;
				}
			}
		}	
		
		return -1;
	}
	
	
}
