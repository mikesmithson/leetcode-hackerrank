package com.leetcode;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(int i = words.length-1 ; i >= 0; i--) {
            if(!words[i].isEmpty()) {
                answer.append(words[i]).append(" ");
            }
        }
        return answer.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println("answer ==> " + reverseWords.reverseWords("the sky is blue"));
    }
}
