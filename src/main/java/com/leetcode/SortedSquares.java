package com.leetcode;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int indexToStoreResult = nums.length -1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sortedSquares[indexToStoreResult--] = nums[left] * nums[left];
                left++;

            } else {
                sortedSquares[indexToStoreResult--] = nums[right] * nums[right];
                right--;
            }
        }

        return sortedSquares;
    }
}
