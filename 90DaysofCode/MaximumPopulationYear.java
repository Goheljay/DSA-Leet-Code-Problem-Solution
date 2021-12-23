package com.jay.leetCode.easy;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int arr[][] = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        System.out.println(maximumPopulation(arr));

    }
    static int maximumPopulation(int[][] logs) {
        int arr[] = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j-1950]++;
            }
        }
        int maxval = 0;
        int maxYear = 1950;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>maxval){
                maxval = arr[i];
                maxYear = i+1950;
            }
        }
        return maxYear;
    }

}
