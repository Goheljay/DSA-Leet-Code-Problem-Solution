package com.jay.leetCode.easy.Arrays;

public class FindNumbersEvenDigit {
    public static void main(String[] args) {
        int [] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums) {
        int evenDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count =0;
            while (number!= 0){
                number = number/10;
                count++;
            }

            if (count%2 == 0){
                evenDigit++;
            }
        }
        return evenDigit;
    }
}
