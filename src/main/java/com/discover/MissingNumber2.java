package com.discover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber2 {
    public int missingNumber(int[] array) {
        List<Integer> listOfNums = new ArrayList<>();
        for (int j : array) {
            listOfNums.add(j);
        }
        Collections.sort(listOfNums);
        for (int i = 1; i < listOfNums.size(); i++) {
            if (listOfNums.get(i) - listOfNums.get(i - 1) > 1) {
                return listOfNums.get(i) - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber2 missing = new MissingNumber2();
        System.out.println(missing.missingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}));
    }
}
