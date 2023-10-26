package com.discover.revision.three;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int startNumber = Integer.MAX_VALUE;
        int endNumber = Integer.MIN_VALUE;
        int expectedSum = 0;
        int actualSum = 0;

        for (int num : nums) {
            startNumber = Math.min(startNumber, num);
            endNumber = Math.max(endNumber, num);
            actualSum += num;
        }

        for (int i = startNumber; i <= endNumber; i++) {
            expectedSum += i;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber missing = new MissingNumber();
        System.out.println(missing.missingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}));
    }
}
