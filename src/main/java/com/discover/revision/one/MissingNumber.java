package com.discover.revision.one;

public class MissingNumber {
    public int missingNumber(int[] array, int N) {
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= N; i++) {
            expectedSum += i;
        }

        for (int j : array) {
            actualSum += j;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber missing = new MissingNumber();
        System.out.println(missing.missingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}, 8));
    }
}
