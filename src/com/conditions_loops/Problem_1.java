/*
    Problem 1
    Subtract the Product and Sum of Digits of an Integer

    link - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

package com.conditions_loops;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        System.out.println("The difference is " + (product - sum));
    }
}
