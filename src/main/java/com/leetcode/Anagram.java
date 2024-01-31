package com.leetcode;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String first, String second) {
        char[] firstWordChars = first.toCharArray();
        char[] secondWordChars = second.toCharArray();
        Arrays.sort(firstWordChars);
        Arrays.sort(secondWordChars);

        return Arrays.equals(firstWordChars, secondWordChars);
    }
}
