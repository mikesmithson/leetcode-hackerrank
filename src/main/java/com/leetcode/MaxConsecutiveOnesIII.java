package com.leetcode;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right;
        int numberOfZeros = 0;
        int result = 0;

        for(right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                numberOfZeros++;
            }

            while(numberOfZeros > k) {
                if(nums[left] == 0) {
                    numberOfZeros--;
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
