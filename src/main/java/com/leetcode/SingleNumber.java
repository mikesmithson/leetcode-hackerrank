package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    private Set<Integer> dictionary = new HashSet<>();

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (dictionary.contains(Integer.valueOf(nums[i]))) {
                dictionary.remove(Integer.valueOf(nums[i]));
            } else {
                dictionary.add(Integer.valueOf(nums[i]));
            }
        }
        return dictionary.stream().distinct().findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        SingleNumber number = new SingleNumber();
        int result = number.singleNumber(new int[]{4,1,2,1,2});

        System.out.println("result == " + result);
    }

}
