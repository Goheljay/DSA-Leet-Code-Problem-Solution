package com.jay.recursion;

public class BinarySerchRec {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9,11, 12};
        int target = 11;
        System.out.println(BS(arr,target,0, arr.length-1));
    }
    static int BS(int arr[], int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = (s+e)/2;

        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid]>target){
            //e = mid-1;
           return BS(arr,target, s, mid-1);
        }
        if (arr[mid]<target){
            //e = mid-1;
            return BS(arr,target, mid+1, e);
        }
        return -1;

    }

}
