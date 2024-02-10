package com.jay.leetCode.medium.string;

public class RemovingNumberFromString {
    public static void main(String[] args) {
        String number = "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
        char digit = '3';
        String num = removeNumber(number, digit);
        System.out.println(num);
    }

    private static String removeNumber(String number, char digit) {
         Integer largeNum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit){
                return number.substring(0, i) + number.substring(i + 1);
            }
        }

        return largeNum.toString();
    }

        public static String removeDigit(String number, char digit) {
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i-1) == digit) {
                    if (number.charAt(i) > number.charAt(i - 1)) {
                        String s = number.substring(0, i - 1) + number.substring(i);
                        return s;
                    }
                }
            }

            int lastIdx = number.lastIndexOf(digit);
            return number.substring(0, lastIdx) + number.substring(lastIdx + 1);
        }

// TC: O(n), SC: O(1)
}
