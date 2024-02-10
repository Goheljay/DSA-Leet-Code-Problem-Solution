package com.jay.geeksforgeeks.array;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int [] arr={0,0,0,1,1};
        System.out.println(transitionPoint(arr,arr.length));

    }
    static int transitionPoint(int arr[], int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            // Find mid
            int mid = (start + end) / 2;
            if (arr.length == 1 && arr[mid] == 0){
                return -1;
            }
            if (arr.length == 1 && arr[mid] == 1){
                return 1;
            }
            if (arr[mid] == 0)
                start = mid + 1;
            else if (arr[mid] == 1) {
                if (mid == 0 || (mid > 0 && arr[mid - 1] == 0))
                    return mid;
                end = mid - 1;
            }
        }
        return -1;
    }
}
