package com.jay.leetCode.medium.searching;

public class Search2DMatrix {
    public static void main(String[] args) {

        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int rowEnd = matrix.length-1;

        int col = 0;
        int colEnd = matrix.length-1;

        while (row < rowEnd){
            int midRow = row+(rowEnd-row)/2;

            if (matrix[midRow][colEnd] == target){
                return true;
            }
            if (matrix[midRow][colEnd] < target){
                row = midRow+1;
            }else {
                rowEnd = midRow;
            }
        }

        while (col<colEnd){
            int midCol = col+(colEnd-col)/2;

            if (matrix[rowEnd][midCol] == target){
                return true;
            }
            if (matrix[rowEnd][midCol] < target){
                col = midCol+1;
            }else {
                colEnd = midCol - 1;
            }
        }
        return false;

    }
}
