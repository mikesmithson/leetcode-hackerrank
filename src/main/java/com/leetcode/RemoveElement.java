package com.leetcode;

public class RemoveElement {
    private int[] nums;

    public int removeElement(int[] nums, int val) {
        int reader = 0;
        int writer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[reader] != val) {
                nums[writer] = nums[reader];
                writer++;
            }
            reader++;
        }

        this.nums = nums;
        return writer;
    }

    public int[] arrayContents() {
        return nums;
    }

}
