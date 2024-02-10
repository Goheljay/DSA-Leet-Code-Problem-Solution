package com.jay.leetCode.easy.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArrays {
    public static void main(String[] args) {

        int nums1[] = {1,2,2,1};
        int nums2[] = {2};
        int [] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length;i++){
            for (int j = 0; j< nums2.length; j++){
                if (nums2[j] == nums1[i]){
                    ans.add(nums1[i]);
                    break;
                }

            }
        }

        int [] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
