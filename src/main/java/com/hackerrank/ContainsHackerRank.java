package com.hackerrank;

import java.util.*;

public class ContainsHackerRank {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int pointer = 0;
        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == target.charAt(pointer)) {
                pointer++;
                if(pointer == target.length()) return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(ContainsHackerRank.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }
}
