/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        while(test --> 0 ){
            int n;
            n = sc.nextInt();
            int arr[] = new int [n];
            for (int i=0; i < n; i++){
                arr[i]=sc.nextInt();
            }
            reverseArray(0,n, arr);
            for (int i=0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println("");

        }
    }
    public static void reverseArray(int start, int end,int [] arr) {
        int i = start,j = end-1;
        //brack condition
        if(i > j) {
            return;
        }
        //main logic
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        //Recursive Call
        reverseArray(i+1, j,arr);
    }
}