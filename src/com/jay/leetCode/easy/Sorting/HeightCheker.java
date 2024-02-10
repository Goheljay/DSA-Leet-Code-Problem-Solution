package com.jay.leetCode.easy.Sorting;

public class HeightCheker {
    public static void main(String[] args) {

    }
    public int heightChecker(int[] heights) {
        int count[] = new int[101];
        int target[] = new int[heights.length];

        // clone array
        for (int i=0; i<heights.length; i++)
            target[i] = heights[i];

        // sort heights using counting sort
        for (int i=0; i<heights.length; i++)
            count[heights[i]]++;

        int j= 0;
        for (int i=0; i<count.length; i++)
            while (count[i] != 0){
                heights[j++] = i;
                count[i]--;
            }

        // Just compare positions
        j = 0;
        for (int i=0; i<target.length; i++){
            if (target[i] != heights[i]) j++;
        }
        return j;
    }
}
