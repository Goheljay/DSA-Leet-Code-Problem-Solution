package com.jay.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class NondecreasingArray {
    public static void main(String[] args) {
//        System.out.println("Enter the Array Size");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        System.out.println("Enter the number");
//        int []a = new int[n];
//        for (int i = 0; i< n; i++){
//            a[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(a));
//        int b[] = new int[n];
//        b[0] = a[0];
//        for (int i = 1; i< a.length; i++){
//            if (a[i] > a[i-1]){
//                b[i] = a[i];
//
//            }else {
//                int ans = a[i-1]/a[i];
//                if (ans * a[i] == a[i-1]){
//                    b[i] = ans;
//                }else {
//                    b[i] = (ans+1)*a[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(b));

        Scanner s =new Scanner(System.in);

        long t;

        t = s.nextInt();




        while(t-->0){

            StringBuilder sb =new StringBuilder();

            int n, i,j,k;

            n = s.nextInt();
            long[] a =new long[n];
            long[] b =new long[n];
            long r,d;

            for(i=0;i<n;i++){
                a[i]= s.nextLong();
                if(i==0)
                    b[i]= a[i];
                else if(a[i]>= b[i-1]){
                    b[i]= a[i];
                }
                else
                {
                    r = b[i-1]% a[i];

                    d = r ==0?0: a[i]- r;

                    b[i]= b[i-1]+ d;

                }
            }
            for(i=0;i<n;i++)

                sb.append( b[i]+" ");

            System.out.println(sb.toString());

        }
    }
}
