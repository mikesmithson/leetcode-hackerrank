package com.hackerrank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put(0, 0);
        dictionary.put(1, 1);
        dictionary.put(2, 1);
    }

    public Integer fibonacci(int fibonacci) {
        if (fibonacci == 0) return 0;
        if (fibonacci == 1 || fibonacci == 2) return 1;

        if (!dictionary.containsKey(fibonacci)) {
            dictionary.put(fibonacci, fibonacci(fibonacci - 1) + fibonacci(fibonacci - 2));
        }
        return dictionary.get(fibonacci);
    }
}
