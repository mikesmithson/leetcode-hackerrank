package com.leetcode;

import java.util.LinkedHashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int compliment = target - nums[index];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), index};
            }
            map.put(nums[index], index);
        }
        return new int[]{-1, -1};
    }
}
