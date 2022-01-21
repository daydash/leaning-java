package com.conditions_loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the power: ");
        int pow = in.nextInt();
        int ans = 1;

        for (int i = 0; i < pow; i++) {
            ans *= n;
        }

        System.out.println(ans);
    }
}
