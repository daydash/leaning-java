package com.basics;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int n = in.nextInt();
        int temp = n;
        int checker = n;
        int count = 0, ans = 0;

        // Counting the length of number
        while (n > 0) {
            n /= 10;
            count++;
        }

        // Calculation the answer
        while (temp > 0) {
            ans = ans + (int) Math.pow(temp % 10, count);
            temp /= 10;
        }

        // Checking the printing if the number is armstrong
        if (checker == ans) {
            System.out.println(checker + " is Armstrong");
        } else {
            System.out.println(checker + " is not Armstrong");
        }

    }
}
