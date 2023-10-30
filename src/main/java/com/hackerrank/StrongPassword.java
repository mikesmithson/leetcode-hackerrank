package com.hackerrank;

import java.util.ArrayList;
import java.util.List;


class StrongPassword {
    private static final List <Character> specialCharacters = new ArrayList<>();
    static {
        specialCharacters.add('!');
        specialCharacters.add('@');
        specialCharacters.add('#');
        specialCharacters.add('$');
        specialCharacters.add('%');
        specialCharacters.add('^');
        specialCharacters.add('&');
        specialCharacters.add('*');
        specialCharacters.add('(');
        specialCharacters.add(')');
        specialCharacters.add('-');
        specialCharacters.add('+');
    }

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        int numberOfCharactersShort = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int numeric = 0;
        int numSpecialCharacters = 0;


        if (n < 6) {
            numberOfCharactersShort = 6 - n;
        }

        for(char letter: password.toCharArray()) {
           if(Character.isLowerCase(letter)) {
               lowerCase ++;
           }
           if(Character.isUpperCase(letter)) {
               upperCase++;
           }
           if(Character.isDigit(letter)) {
               numeric++;
           }
           if(specialCharacters.contains(letter)) {
               numSpecialCharacters++;
           }
        }

        int missing = sumUpNumberMissing(lowerCase, upperCase, numeric, numSpecialCharacters);

        return Math.max(missing, numberOfCharactersShort);
    }

    private static int sumUpNumberMissing(int lowerCase, int upperCase, int numeric, int numSpecialCharacters) {
        int numberMissing = 0;
        List<Integer> criteria = new ArrayList<>();
        criteria.add(lowerCase);
        criteria.add(upperCase);
        criteria.add(numeric);
        criteria.add(numSpecialCharacters);
        for (Integer element: criteria) {
            if(element == 0) numberMissing++;
        }
        return numberMissing;
    }

    public static void main(String[] args) {
        int minimumNumber = StrongPassword.minimumNumber(11, "#HackerRank");
        System.out.println(minimumNumber);
    }
}
