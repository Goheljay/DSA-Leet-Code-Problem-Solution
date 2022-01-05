package com.jay.leetCode.medium.Arrays;

public class FirstAndLastElement {
	public static void main(String[] args) {
		
		int arr[] = {5,7,7,8,8,10};
		int tar = 8;
		
		int[] ans = serchRange(arr, tar);
		System.out.println(ans);
		
	} 
	
	public static int[] serchRange(int arr[], int target) {
		int ans[] = {-1,-1};
		int start = serch(arr, target, true);
		int end = serch(arr, target, false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
		
	}
	
	static int serch(int num[], int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end =num.length-1;
		
		while(start <= end) {
			int mid =  (start+end)/2;
			if(target < num[mid]) {
				end = mid-1;
			}else if (target > num[mid]) {
				start = mid+1;
			}else{
				ans = mid;
				if (findStartIndex) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}
		}
		return ans;
	}
	

}
