package com.leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLongestIncreasingSubsequence(int[] nums) {
        int result = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int result = longestIncreasingSubsequence.lengthOfLongestIncreasingSubsequence(new int[]{1,3,2});
        System.out.println("The longest increasing subsequence is: " + result);
    }

}
