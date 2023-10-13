package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class StairClimbingFibonacci {
    private Map<Integer, Integer> dictionary = new HashMap<>();

    public int climbStairs(int numberOfStairs) {
        if (numberOfStairs == 1) return 1;
        if (numberOfStairs == 2) return 2;
        if(!dictionary.containsKey(numberOfStairs)) {
            dictionary.put(numberOfStairs, climbStairs(numberOfStairs-1) + climbStairs(numberOfStairs-2));
        }
        return dictionary.get(numberOfStairs);
    }

    public static void main(String[] args) {
        StairClimbingFibonacci fibonacci = new StairClimbingFibonacci();
        int numberOfStairs = 10;
        int numberOfPermutations = fibonacci.climbStairs(numberOfStairs);

        System.out.println("Number of ways for climbing "+ numberOfStairs + " stairs is ==> " + numberOfPermutations);
    }

}
