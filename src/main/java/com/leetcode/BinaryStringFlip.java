package com.leetcode;

/*
 * You are given a binary string s (a string containing only "0" and "1").
 * You may choose up to one "0" and flip it to a "1".
 * What is the length of the longest substring achievable that contains only "1"
 */
public class BinaryStringFlip {
    public int findLength(String binary) {
        int left=0;
        int right;
        int numberOfZeros = 0;
        int result = 0;

        for(right = 0; right < binary.length(); right++) {
                if(binary.charAt(right) == '0') {
                    numberOfZeros++;
                }

                while(numberOfZeros > 1) {
                    if(binary.charAt(left) == '0') {
                        numberOfZeros--;
                    }
                    left++;
                }
                result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
