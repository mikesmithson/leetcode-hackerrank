package com.leetcode;

public class ContiguousSum {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        for (int i : nums) {
            if (runningSum < 0) runningSum = i;
            else runningSum += i;
            maxSum = Math.max(maxSum, runningSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int result = ContiguousSum.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println("result = " + result);
    }
}
