package com.jay.leetCode.medium.Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
//        sortColorsArrays(arr);
        sortColorArraySecondWay(arr);
        System.out.print("New Array " + Arrays.toString(arr));
    }

    private static void sortColorArraySecondWay(int[] arr) {
        int min = 0;
        int mid = 0;
        int temp = 0;
        int max = arr.length - 1;
        while (mid <= max) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[min];
                    arr[min] = arr[mid];
                    arr[mid] = temp;
                    min++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[max];
                    arr[max] = temp;
                    max--;
                    break;
            }
        }
    }

    public  static void swap(int[] arr, int min, int mid) {
        int temp = 0;
        temp = min;
        min = mid;
        mid = temp;
    }

    private static void sortColorsArrays(int[] arr) {
        //using counting sort
        int zero = 0, one = 0, two = 0;
        int [] opt = new int[arr.length];

        //find counts
        for (int a : arr) {
            if (a == 0) {
                zero++;
            }
            if (a == 1) {
                one++;
            }
            if (a == 2) {
                two++;
            }
        }

        //add count
        for (int i = 0; i < zero; i++) {
            opt[i] = 0;
        }
        for (int i = zero; i < opt.length; i++) {
            opt[i] = 1;
        }
        for (int i = zero+one; i < opt.length; i++) {
            opt[i] = 2;
        }
        //replace to original array
        System.arraycopy(opt, 0, arr, 0, opt.length);
    }

}
