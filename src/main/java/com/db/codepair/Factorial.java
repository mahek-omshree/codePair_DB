package com.db.codepair;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 100;
        int n3 = 1000;
        int n4 = 10000;
        System.out.println("Factorial of number " + n1 + " upto 10 digits is :- " + factorialTillFirstTenDigits(n1));
        System.out.println("Factorial of number " + n2 + " upto 10 digits is :- " + factorialTillFirstTenDigits(n2));
        System.out.println("Factorial of number " + n3 + " upto 10 digits is :- " + factorialTillFirstTenDigits(n3));
        System.out.println("Factorial of number " + n4 + " upto 10 digits is :- " + factorialTillFirstTenDigits(n4));
    }

    private static String factorialTillFirstTenDigits(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        if (String.valueOf(factorial).length() > 10) {
            return factorial.toString().substring(0, 10);
        } else return String.valueOf(factorial);
    }
}
