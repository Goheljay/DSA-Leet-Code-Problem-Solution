package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,3,8,1,6,8};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int lo = 0; int hi = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[lo]) >= Math.abs(A[hi])) {
                res[i] = A[lo] * A[lo];
                lo++;
            } else {
                res[i] = A[hi] * A[hi];
                hi--;
            }
        }
        return res;
    }
}
