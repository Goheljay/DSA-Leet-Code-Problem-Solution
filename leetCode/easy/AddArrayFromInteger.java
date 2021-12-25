package com.jay.leetCode.easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddArrayFromInteger {
    public static void main(String[] args) {
        int arr[] = {2,1,5};
        int k  = 806;
        System.out.println(new ArrayList(addToArrayForm(arr,k)));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> sol = new ArrayList<>();
        for (int i = num.length-1; i >= 0 || k > 0; i--){
            if (i >= 0){
                sol.add((num[i]+k)%10);
                k = (num[i]+k)/10;
            }else {
                sol.add(k%10);
                k = k/10;
            }
        }

        Collections.reverse(sol);
        return sol;
    }
}
