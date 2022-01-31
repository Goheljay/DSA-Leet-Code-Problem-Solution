package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class ArrayPartiation {
    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        // counting sort algorithm
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[nums.length];
        int sum = 0, p = 0;

        // for each index, increment the count of occurence of the element in that index
        for (int i = 0; i < nums.length; i++)
        {
            count[nums[i] - min]++;
        }

        // copying the elements based on occurence into other array
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                output[p++] = min + i;
                count[i]--;
            }

        }

        // main logic for the problem description
        // taking the first element of each pair in the array since in sorted array,
        // the first element of the pair would be minimum
        for(int i = 0; i < output.length; i++){
            if(i % 2 == 0){
                sum += output[i];
            }
        }
        return sum;
    }
}
