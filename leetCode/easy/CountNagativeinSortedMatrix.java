package com.jay.leetCode.easy;

public class CountNagativeinSortedMatrix {
    public static void main(String[] args) {

    }
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] g : grid) {
            int i = 0;
            int j = g.length - 1;
            while(i <= j) {
                int mid = (i + j)/2;
                if(g[mid] >= 0) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
            count += g.length - i;
        }
        return count;
    }
}
