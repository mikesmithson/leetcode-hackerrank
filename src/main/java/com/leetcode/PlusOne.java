package com.leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int lastIndexOf = digits.length - 1;
        for (int i = lastIndexOf; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] allNines = new int[digits.length + 1];
        allNines[0] = 1;
        return allNines;
    }
}
