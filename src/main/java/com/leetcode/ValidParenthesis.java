package com.leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private static final Map<Character, Character> parensPairs = Map.of('(', ')', '{', '}', '[', ']');
    private static final Stack<Character> trackedParens = new Stack<>();

    public boolean isValid(String s) {
        for (char parens : s.toCharArray()) {
            if (parensPairs.containsKey(parens)) { //opening bracket
                trackedParens.push(parens);
            } else { //closing bracket
                if (trackedParens.isEmpty()) {
                    return false;
                }
                char openParens = trackedParens.pop();
                if(parensPairs.get(openParens) != parens) {
                    return false;
                }
            }
        }

        return trackedParens.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        boolean valid = validParenthesis.isValid("{[]}");
        System.out.println("is valid == "+ valid);
    }
}
