package com.jay.leetCode.easy.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int [] gain ={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gain) {
        int altitude = 0;
        int arr[] = new int[gain.length+1];

        for (int i = 0; i < gain.length; i++){
            altitude = altitude+gain[i];
            arr[i+1] = altitude;
        }

        for (int i =0; i<arr.length; i++){
            if (altitude < arr[i]){
                altitude = arr[i];
            }
        }
        return altitude;
    }
}
