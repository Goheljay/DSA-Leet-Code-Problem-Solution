package com.jay.leetCode.easy.Searching;

public class FirstBadVersion {
    //https://leetcode.com/problems/first-bad-version/submissions/
    //278 Leetcode
    public static void main(String[] args) {
        int number = 2126753390;
        int target = 1702766719;
        System.out.println(firstBadVersion(number, target));

    }

    static int firstBadVersion(int n, int target){
        int start = 0;
        int end = n;

        while(start<end){
            int mid = start + (end - start)/2;

            if(isBadVersion(mid, target)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }


    public  static boolean isBadVersion(int mid, int target){
        boolean ans = false;

        if (mid == target){
            ans = true;
        }else {
            ans = false;
        }
        return ans;
    }
}
