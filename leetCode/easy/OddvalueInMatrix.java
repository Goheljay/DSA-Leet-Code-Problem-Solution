package com.jay.leetCode.easy;

public class OddvalueInMatrix {
    public static void main(String[] args) {
        int m =2;
        int n = 3;
        int indices[][] = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));

    }
    static int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j]++;
            }
            for (int j = 0;j<m; j++){
                arr[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
