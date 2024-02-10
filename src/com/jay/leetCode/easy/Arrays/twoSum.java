package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] arr, int target) {

      for (int i = 0; i < arr.length; i++){
          for (int j = i+1; j < arr.length; j++) {
              if (arr[i]+arr[j] == target){
                  return new int[]{i,j};
              }
          }
      }
        return new int[]{0,0};
    }
}
