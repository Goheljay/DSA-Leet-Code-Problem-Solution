package com.jay.leetCode.easy.Arrays;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12, 345, 2, 6, 7896};
		System.out.println(findDeigits(arr));
		
		System.out.println(counter(12345));
	}
	
	static int findDeigits(int arr[]) {
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(even(arr[i])) {
				count++;
			}
		}
		return count;
	}
	
	

	static boolean even(int nums) {
		int digitsofNumber = counter(nums);
		
		
		return digitsofNumber % 2 == 0;
	}
	
	static int counter(int nums) {
		
		int count = 0;
		
		if(nums<0) {
			nums *=-1;
		}
		
		while(nums>0) {
			count++;
			nums = nums/10;
		}
		
		return count;
	}
	

}
