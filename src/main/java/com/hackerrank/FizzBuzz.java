package com.hackerrank;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        StringBuilder builder = new StringBuilder();
        if(n % 3 == 0) {
            builder.append("Fizz");
        }
        if(n % 5 == 0) {
            builder.append("Buzz");
        }

        if (n % 3 !=0 && n % 5 != 0){
            builder.append(String.valueOf(n));
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        FizzBuzz.fizzBuzz(1);
    }
}
