package com.methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        test(n);
    }

    private static void test(int n) {
        if (n % 2 == 0) System.out.println(n + " is even");
        else System.out.println(n + " is odd");
    }
}
