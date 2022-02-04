package com.jay.leetCode.easy.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public static void main(String[] args) {

    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        for(int num: arr2) map.put(num,0);
        for(int i = 0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
                arr1[i] = -1;
            }
        }
        Arrays.sort(arr1);
        for(int num: arr2){
            int size = map.remove(num);
            while (size > 0){
                arr1[counter++] = num;
                size--;
            }
        }
        return arr1;
    }
}
