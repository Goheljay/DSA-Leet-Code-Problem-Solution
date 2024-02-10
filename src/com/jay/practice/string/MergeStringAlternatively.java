package com.jay.practice.string;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqr";
        String s = mergeAlternately(word1, word2);
        System.out.println(s);
    }

    public static String mergeAlternately(String word1, String word2) {
        String[] word1Split = word1.split("");
        String [] word2Split = word2.split("");
        int i = 0, j = 0;
        StringBuilder word = new StringBuilder();
        while((i < word1Split.length) || (j < word2Split.length)) {
            if (i < word1Split.length) {
                word.append(word1Split[i++]);
            }
            if (j < word2Split.length) {
                word.append(word2Split[j++]);
            }
        }
        return word.toString();

    }
}
