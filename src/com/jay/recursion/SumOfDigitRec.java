package com.jay.recursion;

public class SumOfDigitRec {

    public static void main(String[] args) {
        int n = 5;

        int i = sumOfNumber(n);
        System.out.println(i);

        double pow = findPow(2.10000, 3);
        double binary = binaryExp(2.00000, 10);
        System.out.println(pow);
        System.out.println(binary);
    }

    private static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigit((n/10));

    }

    static int sumOfNumber(int n){
        if(n == 0) {
            return 0;
        }
        System.out.println(n);

        /**
         * First n: is Past value
         * under the function param n-1: is current value
         * cal the past and first oth val
         */
        return n +(sumOfNumber(n-1));
    }

    static double findPow(double x, int n) {
        // Base Method
        if (n == 0)
            return 1;

        if (x == 0)
            return 0;

        return x*(findPow(x,n-1));
    }

    private static double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }

        // Handle case where, n < 0.
        if (n < 0) {
            n = -1 * n;
            x = 1.0 / x;
        }

        // Perform Binary Exponentiation.
        double result = 1;
        while (n != 0) {
            // If 'n' is odd we multiply result with 'x' and reduce 'n' by '1'.
            if (n % 2 == 1) {
                result = result * x;
                n -= 1;
            }
            // We square 'x' and reduce 'n' by half, x^n => (x^2)^(n/2).
            x = x * x;
            n = n / 2;
        }
        return result;
    }

}
