package com.leetcode;

public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String substringToCompare = haystack.substring(i, i + needle.length());
            if (substringToCompare.contains(needle)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        NeedleInHaystack needleInHaystack = new NeedleInHaystack();
        System.out.println(needleInHaystack.strStr("sadbutsad", "sad"));
    }
}

