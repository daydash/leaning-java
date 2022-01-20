package com.basics;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        long a = in.nextLong();
        System.out.print("Enter the second number : ");
        long b = in.nextLong();

        if (a > b) {
            System.out.println(a + " is Greater");
        } else if (b > a) {
            System.out.println(b + " is Greater");
        } else {
            System.out.println("Both are equal to " + a);
        }
    }
}
