package com.db.codepair;

public class ConverStringToInteger {
    public static void main(String[] args) {
        System.out.println(convertStringToAmount("$180,240/y"));
    }

    private static Integer convertStringToAmount(String value) {
        String onlyNumbersAsString = value.replaceAll("[^\\d]", "");
        return Integer.parseInt(onlyNumbersAsString);
    }
}
