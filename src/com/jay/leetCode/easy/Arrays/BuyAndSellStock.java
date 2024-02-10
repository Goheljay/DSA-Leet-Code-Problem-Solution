package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {1,2,4};
        int value = brutforceApproach(arr);
        int alt = alternativeLogic(arr);
        System.out.println(alt);
    }

    private static int brutforceApproach(int[] arr) {
        int bestPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i] < arr[j]) {
                   int newVal = arr[j]-arr[i];
                   if (newVal > bestPrice) {
                       bestPrice = newVal;
                   }
               }
            }
        }
        return bestPrice;
    }

    private static int alternativeLogic(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
