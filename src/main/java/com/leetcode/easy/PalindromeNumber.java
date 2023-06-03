package com.leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a=1221;
        System.out.println(isPalindrome(a));

        System.out.println(isPalindromeV2(a));
    }

    public static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();
        for (int i=0; i<original.length(); i++) {
            reverse.append(original.charAt(original.length()-i-1));
        }
        return original.contentEquals(reverse);
    }

    public static boolean isPalindromeV2(int x) {
        String original = String.valueOf(x);
        for (int i=0; i < original.length(); i++) {
            if(original.charAt(i) != original.charAt(original.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
