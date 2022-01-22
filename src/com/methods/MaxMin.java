package com.methods;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        largest(a, b, c);
        smallest(a, b, c);
    }

    private static void largest(int a, int b, int c) {
        System.out.println("Largest is: " + Math.max(c, Math.max(a, b)));
    }

    private static void smallest(int a, int b, int c) {
        System.out.println("Smallest is: " + Math.min(c, Math.min(a, b)));
    }

}
