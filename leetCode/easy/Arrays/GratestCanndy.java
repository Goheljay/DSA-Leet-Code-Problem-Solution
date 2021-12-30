package com.jay.leetCode.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class GratestCanndy {
	public static void main(String[] args) {
		int arr[] = {2,8,7};
		int extra = 1;
		
		List<Boolean> answer = kidsWithCandies(arr, extra);
		System.out.println(answer);
	}
	
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> ans = new ArrayList<>();
		int max = 0;
		
		for (int i = 0; i < candies.length; i++) {
			max = Math.max(max, candies[i]);
			
			if(candies[i]+extraCandies < max) {
				ans.add(false);
			}else {
				ans.add(true);
			}
		}
		return ans;
    }	
}
