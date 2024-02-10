package com.jay.leetCode.easy.Arrays;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int ans[][] = flipAndInvertImage(image);
        System.out.println(Arrays.toString(ans));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        for (int i = 0; i<m; i++){
            for (int j = 0; j < (n+1)/2; j++) {
                int temp = image[i][j]^1;
                image[i][j] = image[i][n-j-1]^1;
                image[i][n-j-1] = temp;
            }
        }
        return image;
    }
}
