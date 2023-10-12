package com.leetcode;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int result = 0;
        char[] str = Integer.toBinaryString(n).toCharArray();
        for(int characters: str) {
            if(characters == 49) {
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        System.out.println(numberOfOneBits.hammingWeight(00000000000000000000000000001011));
    }
}
