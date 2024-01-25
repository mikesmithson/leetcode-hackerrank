package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> dictionary = new HashSet<>();
        while(n != 1 && !dictionary.contains(n)) {
                dictionary.add(n);
                n = getNext(n);
        }
        return n == 1;
    }

    private static int getNext(int n) {
        int sumOfSquares = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sumOfSquares += digit * digit;
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }
}
