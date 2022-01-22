package com.conditions_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // normal code
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        // hacks
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}