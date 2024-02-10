package com.jay.practice;

public class SearchingString {
	public static void main(String[] args) {
		String name = "Jay";
		char target = 'a';
		
		int ans = Search(name, target);
		System.out.println(ans);
	}
	
	static int Search(String name, char tar) {
		
		for (int i = 0; i<name.length(); i++) {
			if(tar == name.charAt(i)) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}

}
