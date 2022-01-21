/*
    Problem 2

    Write a program to print the sum of negative numbers, sum of positive even numbers and
    the sum of positive odd numbers from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
 */

package com.conditions_loops;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int negative_sum = 0;
        int even_sum = 0;
        int odd_sum = 0;

        System.out.println("Enter the numbers");
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            if (n > 0) {
                if (n % 2 == 0) even_sum += n;
                else odd_sum += n;
            } else negative_sum += n;
        }

        System.out.println("Sum of negative numbers is " + negative_sum);
        System.out.println("Sum of even numbers is " + even_sum);
        System.out.println("Sum of odd numbers is " + odd_sum);

    }
}
