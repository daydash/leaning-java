package com.conditions_loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int temp = n;
        int sum = 0;

        for (int i = 1; i <= temp / 2; i++) {
            if (temp % i == 0) {
                sum += i;
            }
        }

        if (sum == n) System.out.println(n + " is a perfect number");
        else System.out.println(n + " is not a perfect number");
    }
}
