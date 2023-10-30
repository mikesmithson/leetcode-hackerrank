package com.hackerrank;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i += 3) {
            String message = s.substring(i, i + 3);
            if (message.charAt(0) != 'S') {
                result++;
            }
            if (message.charAt(1) != 'O') {
                result++;
            }
            if (message.charAt(2) != 'S') {
                result++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int result = Result.marsExploration("SOSSPSSQSSOR");
        System.out.println(result);
    }

}
