package com.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put(0, 0);
        dictionary.put(1, 1);
        dictionary.put(2, 1);
    }

    public List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(calculateFibonacci(i));
        }
        return result;
    }

    public Integer calculateFibonacci(int fibonacci) {
        if (fibonacci == 0) return 0;
        if (fibonacci == 1 || fibonacci == 2) return 1;

        if (!dictionary.containsKey(fibonacci)) {
            dictionary.put(fibonacci, calculateFibonacci(fibonacci - 1) + calculateFibonacci(fibonacci - 2));
        }
        return dictionary.get(fibonacci);
    }
}
