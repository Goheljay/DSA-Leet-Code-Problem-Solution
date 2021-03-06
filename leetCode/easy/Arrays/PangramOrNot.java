package com.jay.leetCode.easy.Arrays;

public class PangramOrNot {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    static boolean checkIfPangram(String sentence) {
        boolean arr[] = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i)-97] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false){
                return false;
            }
        }
        return true;
    }
}
