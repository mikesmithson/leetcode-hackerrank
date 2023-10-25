package com.leetcode;

import java.util.*;

public class WordPattern {
    private final Map<String, String> dictionary = new HashMap<>();

    public boolean wordPattern(String pattern, String words) {
        List<String> wordsList = Arrays.asList(words.split(" "));
        List<String> patternList = Arrays.asList(pattern.split(""));
        if (wordsList.size() != patternList.size()) {
            return false;
        }
        for (int i = 0; i < wordsList.size(); i++) {
            String patternKey = patternList.get(i);
            String wordValue = wordsList.get(i);

            if (!dictionary.containsKey(patternKey)) {
                dictionary.put(patternKey, wordValue);
            }
            if (!dictionary.containsKey(wordValue)) {
                dictionary.put(wordValue, patternKey);
            }

            if (!dictionary.get(patternKey).equals(wordValue) && !dictionary.get(wordValue).equals(patternKey)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern pattern = new WordPattern();
        boolean isValidPattern = pattern.wordPattern("abba", "dog dog dog dog");

        System.out.println("Is Valid: " + isValidPattern);
    }
}
