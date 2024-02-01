package com.leetcode;

public class Palindrome {
    public static boolean isPalindrome(String candidate) {
        int left = 0;
        int right = candidate.length() - 1;
        while (left <= right) {
            if(candidate.charAt(left) != candidate.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
