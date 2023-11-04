package com.hackerrank;

import java.util.Scanner;

public class StaticInitializers {
    static int base = 0;
    static int height = 0;
    static {
        Scanner scanner = new Scanner(System.in);
        base = Integer.valueOf(scanner.nextLine());
        height = Integer.valueOf(scanner.nextLine());
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

    }
}
