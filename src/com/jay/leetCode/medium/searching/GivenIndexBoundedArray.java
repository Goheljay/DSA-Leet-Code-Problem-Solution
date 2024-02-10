package com.jay.leetCode.medium.searching;

public class GivenIndexBoundedArray {
    public static void main(String[] args) {

    }
    public int maxValue(int n, int index, int maxSum) {

        int sum = n;
        int l = index, r = index;
        int res = 1;  //intial height

        while (sum + (r - l + 1) <= maxSum) {
            sum += r - l + 1;

            // ensuring l doesn't go below 0 && r doesn't go beyond n-1
            l = l == 0 ? 0 : l - 1;
            r = r == n - 1 ? r : r + 1;
            res++;

            //optimizing once l == 0 and r == n-1 as we need to add n in each step
            if (l == 0 && r == n - 1) {
                int steps = 0;
                steps += (maxSum - sum) / n;
                sum += (steps * n);
                res += steps;
            }
        }

        return res;
    }
}
