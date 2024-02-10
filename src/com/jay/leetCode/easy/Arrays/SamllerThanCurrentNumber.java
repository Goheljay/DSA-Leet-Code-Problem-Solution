package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class SamllerThanCurrentNumber {
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent2(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;

    }

    //Constraints:
       //2 <= nums.length <= 500
       //0 <= nums[i] <= 100
    //Optimized Approach
    static int[] smallerNumbersThanCurrent2(int[] nums) {
        int ans[] = new int[nums.length];
        int temp[] = new int[101];

        //Frequency Stored
        for (int i =0; i< nums.length; i++){
            temp[nums[i]]++;
        }

        //Making Sum
        for (int i = 1; i < 101; i++) {
            temp[i] = temp[i]+temp[i-1];
        }

        //Stored Final Answer in ans Array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                ans[i] = 0;
            }else {
                ans[i] = temp[nums[i]-1];
            }
        }
        return ans;
    }

}
