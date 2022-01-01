package com.jay.practice;

public class InfiniteArray {
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,6,7,8,9,10,11,15,20};
		int tar =7;
		
		System.out.println(findingRang(arr, tar));
	}
	
	static int findingRang(int [] arr, int tar) {
		int start = 0;
		int end = 1;
		
		while(tar > arr[end]) {
			int newStart = end+1;
			end = end+(end- start+1)*2;
			start = newStart;
		}
		
		return SimpleBinary(arr, tar, start, end);
	}
	static int SimpleBinary(int arr[], int tar, int start, int end){
		
		
		while(start <= end) {
			int mid = (start+end)/2;
			if (arr[mid] > tar) {
				end = mid-1;
			}else if (arr[mid] < tar) {
				start =mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
