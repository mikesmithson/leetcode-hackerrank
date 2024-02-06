package com.leetcode;

/*
 * Given an array of positive integers nums and an integer k,
 * find the length of the longest subarray whose sum is less than or equal to k
 */
public class LongestSubArray {
    public static int findLength(int[] nums, int k) {
        int left = 0;
        int currentSum = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
           currentSum += nums[right];

           while(currentSum > k) {
               currentSum -= nums[left];
               left++;
           }
            result = Math.max(result, right-left + 1);
        }
        return result;
    }
}
