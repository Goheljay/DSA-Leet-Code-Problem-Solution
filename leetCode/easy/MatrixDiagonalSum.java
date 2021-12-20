package com.jay.leetCode.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{5}};
        System.out.println(diagonalSum(arr));

    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum+mat[i][i]+mat[i][mat.length-1-i];
        }
        if (mat.length%2 == 0){
            return sum;
        }else {
            int n = mat.length;
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }
}
