package com.leetcode;
/* You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average
 * value and return this value. Any answer with a calculation error less than 10-5 will be accepted
 */
public class MaxAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Add the new element and remove the oldest element in the window
            maxSum = Math.max(maxSum, sum);
        }
        // Calculate the maximum average by dividing maxSum by k (as double for floating-point division)
        return (double) maxSum / k;
    }

}
