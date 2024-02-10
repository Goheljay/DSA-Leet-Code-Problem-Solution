package com.jay.practice;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int sum = 0;

        while (num > 0 ){
            sum+= (num%10);
            num = num / 10;
        }

        if(sum < 10){
            return sum;
        } else {
            int i = addDigits(sum);
            return i;
        }

    }
}
