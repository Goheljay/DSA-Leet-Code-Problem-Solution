package com.jay.leetCode.easy.String;

public class ShuffleString {
    public static void main(String[] args) {

    }
    public String restoreString(String s, int[] indices) {
        String[] array = s.split("");
        for(int i = 0; i < indices.length; i++){
            for ( int j = 0; j < indices.length; ++j ) {
                if ( indices[i] < indices[j] ) {
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                    String tempp = array[i];
                    array[i] = array[j];
                    array[j] = tempp;
                }
            }
        }
        String str = "";
        for ( int i = 0; i < array.length; ++i ) {
            str += array[i];
        }
        return str;
    }
}
