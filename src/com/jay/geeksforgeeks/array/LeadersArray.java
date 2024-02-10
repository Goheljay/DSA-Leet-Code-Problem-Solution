package com.jay.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersArray {
    public static void main(String[] args) {
        int [] arr = {16,17,5,4,3,5,2};
        int n = 7;
        ArrayList<Integer> vale = findLeader(arr);
        System.out.println(vale);
    }

    private static ArrayList<Integer> findLeader(int[] arr) {
        ArrayList<Integer> newVal = new ArrayList<>();
        int rMax = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > rMax) {
                rMax = arr[i];
                newVal.add(arr[i]);
            }
        }
        Collections.reverse(newVal);
        return newVal;
    }
}
