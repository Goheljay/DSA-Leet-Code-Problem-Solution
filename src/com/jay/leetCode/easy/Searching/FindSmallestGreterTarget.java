package com.jay.leetCode.easy.Searching;

public class FindSmallestGreterTarget {
    public static void main(String[] args) {
        char[] data = {'c','f','j'};
        char c = nextGreatestLetter(data, 'c');
        System.out.println(c);
    }
    static char nextGreatestLetter(char[] letters, char target) {

        int s = 0;
        int e = letters.length;
        while (s <= e) {
            int mid = s+(e-s)/2;
            if(letters[mid]==target) {
                return letters[mid+1];
            } else if(target > letters[mid]) {
                s = mid+1;
            } else {
                e = mid -1;
            }
        }
        return letters[0];
    }
}
