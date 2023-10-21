package com.leetcode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] cycledNums = new int[nums.length];
        int index = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            cycledNums[index] = nums[i];
            index++;
        }
        for (int i = 0; i <= nums.length - (k + 1); i++) {
            cycledNums[index++] = nums[i];
        }
        System.arraycopy(cycledNums, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
