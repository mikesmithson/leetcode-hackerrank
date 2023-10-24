package com.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for(int i= 0; i< nums.length; i++) {
            if(nums[i] != 0) {
                nums[pointer++] = nums[i];
            }
        }
        for(int j = pointer; j< nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0,1,0,3,12});
    }
}


