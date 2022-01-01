package com.jay.InterviewBit;

public class PickFromBothSidesMaxSum {
    public static void main(String[] args) {

        int[] arr = {5, -2, 3 , 1, 2};
        int num = 3;
        System.out.println(solve(arr, num));
    }
    static int solve(int[] A, int B) {
        int currentSum = 0;
        for(int i = 0; i< 4; i++){
            currentSum = currentSum+A[i];
        }
        int MaxVal = currentSum;
        int inc = A.length-1, exc = B-1;
        while (exc >= 0 && inc >= 0){
            currentSum = currentSum+A[inc--];
            currentSum = currentSum-A[exc--];
            MaxVal = Math.max(currentSum, MaxVal);
        }
        return MaxVal;
    }
}
