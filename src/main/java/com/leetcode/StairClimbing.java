package com.leetcode;

public class StairClimbing {

    public long climbStairs(int numberOfStairs) {
        long[] memo = new long[numberOfStairs + 1];
        return recursivelyClimbStairs(0, numberOfStairs, memo);
    }

    private long recursivelyClimbStairs(int stepNumber, int numberOfStairs, long[] memo) {
        if (stepNumber > numberOfStairs) return 0;
        if (stepNumber == numberOfStairs) return 1;
        if (memo[stepNumber] > 0) return memo[stepNumber];

        memo[stepNumber] =  recursivelyClimbStairs(stepNumber + 1, numberOfStairs, memo) +
                recursivelyClimbStairs(stepNumber + 2, numberOfStairs, memo);

        return memo[stepNumber];
    }

    public static void main(String[] args) {
        StairClimbing stairClimbing = new StairClimbing();
        System.out.println(stairClimbing.climbStairs(100));
    }
}
