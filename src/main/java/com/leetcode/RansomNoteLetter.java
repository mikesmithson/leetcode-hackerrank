package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteLetter {

    private Map<Character, Integer> magazineLetterCount = new HashMap<>();

    public boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < magazine.length(); i++) {
            int seen = magazineLetterCount.getOrDefault(magazine.charAt(i), 0);
            magazineLetterCount.put(magazine.charAt(i), ++seen);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteLetter = ransomNote.charAt(i);
            int numberOfRansomLetters = magazineLetterCount.getOrDefault(ransomNoteLetter, 0);
            if(numberOfRansomLetters == 0) {
                return false;
            }
            magazineLetterCount.put(ransomNoteLetter, --numberOfRansomLetters);
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNoteLetter ransomNoteLetter = new RansomNoteLetter();
        boolean canConstruct = ransomNoteLetter.canConstruct("aa", "ab");
        System.out.println("Can construct ==> " + canConstruct);
    }
}
