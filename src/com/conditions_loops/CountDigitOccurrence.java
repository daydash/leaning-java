package com.conditions_loops;

import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = in.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}