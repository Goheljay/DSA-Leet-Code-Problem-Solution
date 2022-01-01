package com.jay.practice;

public class LinerrarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {18, 12, 9, 14, 77, 50};
		char arrChar[] = {'a', 'd','f', 'j'};
		char target = 'j';
//		int ans = Searching(arr, target);
//		boolean ans = Searching2(arr, target);
		int ans = Searching3(arrChar, target);
		System.out.println(ans);

	}
	
	static int Searching(int arr[], int tar) {
		for(int i=0; i<arr.length; i++) {
			
			int element = arr[i];
			if (element == tar) {
				return i;
			}
		}
		return -1;
	}
	
//	return true or false
	static Boolean Searching2(int arr[], int tar) {
		for(int i=0; i<arr.length; i++) {
			
			int element = arr[i];
			if (element == tar) {
				return true;
			}
		}
		return false;
	}
	
//	return charecter
	static int Searching3(char arr[], char tar) {
		for(int i=0; i<arr.length; i++) {
			
			int element = arr[i];
			if (element == tar) {
				return i;
			}
		}
		return -1;
	}

}
