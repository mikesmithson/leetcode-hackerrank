package com.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = -1;
        int secondIndex = -1;
        int nextNumber;
        first:
        for (int i = 0; i < nums.length; i++) {
            firstIndex = i;
            nextNumber = target - nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == nextNumber && j != i) {
                    secondIndex = j;
                    break first;
                }
            }
        }
        return new int[]{firstIndex, secondIndex};
    }
}
