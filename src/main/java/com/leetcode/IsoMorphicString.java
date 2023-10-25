package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    private Map<Character, Character> mapStoT = new HashMap<>();
    private Map<Character, Character> mapTtoS = new HashMap<>();

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!(mapStoT.containsKey(sChar) && mapTtoS.containsKey(tChar))) {
                mapStoT.put(sChar, tChar);
                mapTtoS.put(tChar, sChar);
            } else {
                if (mapStoT.get(sChar) != tChar || mapTtoS.get(tChar) != sChar) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsoMorphicString isoMorphicString = new IsoMorphicString();
        boolean isomorphic = isoMorphicString.isIsomorphic("badc", "baba");
        System.out.println("Is isomorphic: " + isomorphic);
    }
}
