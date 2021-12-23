package com.jay.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class NondecreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the Array Size");

            int n = sc.nextInt();

            System.out.println("Enter the number");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(a));
            int b[] = new int[n];
            b[0] = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[i - 1]) {
                    b[i] = a[i];

                } else {
                    int ans = a[i - 1] / a[i];
                    if (ans * a[i] == a[i - 1]) {
                        b[i] = ans;
                    } else {
                        b[i] = (ans + 1) * a[i];
                    }
                }
            }
            StringBuilder sb =new StringBuilder();
            for (int i = 0; i < n; i++){
                sb.append(b[i] + " ");
            System.out.println(sb.toString());
            }
            t--;
        }
    }
}
