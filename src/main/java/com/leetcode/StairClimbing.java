package com.leetcode;

public class StairClimbing {

    public int climbStairs(int numberOfStairs) {
        int[] memo = new int[numberOfStairs + 1];
        return recursivelyClimbStairs(0, numberOfStairs, memo);
    }

    private int recursivelyClimbStairs(int stepNumber, int numberOfStairs, int[] memo) {
        if (stepNumber > numberOfStairs) {
            return 0;
        }
        if (stepNumber == numberOfStairs) {
            return 1;
        }
        if (memo[stepNumber] > 0) {
            return memo[stepNumber];
        }
        memo[numberOfStairs] = recursivelyClimbStairs(numberOfStairs + 1, numberOfStairs, memo) +
                recursivelyClimbStairs(numberOfStairs + 2, numberOfStairs, memo);
        return memo[stepNumber];
    }

    public static void main(String[] args) {
        StairClimbing stairClimbing = new StairClimbing();
        System.out.println(stairClimbing.climbStairs(1));
    }
}
