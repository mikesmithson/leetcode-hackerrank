package com.leetcode;

public class RemoveArrayDuplicates {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();
        int[] nums = new int[]{1,1,2,2};
        int result = removeArrayDuplicates.removeDuplicates(nums);

        System.out.println("Result ==  " + result);
    }
}
