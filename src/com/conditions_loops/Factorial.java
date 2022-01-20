package com.conditions_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int f = 1;

        for (int i = 2; i <= n; i++) {
            f *= i;
        }

        System.out.println("Factorial of " + n + " is " + f);
    }
}
