package com.jay.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualIndexValue {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList newArr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == i+1){
                newArr.add(i+1);
            }
        }
        return newArr;

    }
}
