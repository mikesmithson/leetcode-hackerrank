package com.hackerrank;

import java.util.List;

public class MinNumberOfMoves {
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int numberOfMoves = 0;
        for (int i = 0; i < arr1.size(); i++) {
            char[] firstCharArray = String.valueOf((int) arr1.get(i)).toCharArray();
            char[] secondCharArray = String.valueOf((int) arr2.get(i)).toCharArray();

            for (int j = 0; j < firstCharArray.length; j++) {
                numberOfMoves += Math.abs((firstCharArray[j] - 48) - (secondCharArray[j] - 48));
            }

        }
        return numberOfMoves;
    }
}
