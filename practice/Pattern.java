package com.jay.practice;

public class Pattern {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 0; row < n; row++) {

            int totalColInRow = n-row+1;

            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < n*2; row++) {

            int totalColInRow = row > n? n*2-row : row;

            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void  pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n ; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern30 (int n){
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valueOfCol = Math.min(Math.min(row,col),Math.min(n-row, n-col));
                System.out.print(valueOfCol+" ");
            }
            System.out.println(" ");
        }
    }
}
