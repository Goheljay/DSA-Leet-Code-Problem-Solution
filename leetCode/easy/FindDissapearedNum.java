package com.jay.leetCode.easy;

import java.util.ArrayList;
import java.util.List;
//Cycleci Sort
public class FindDissapearedNum {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappera(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappera(int nums[]){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index<nums.length; index++){
            if (nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = second;
        arr[second] = temp;
    }
}
