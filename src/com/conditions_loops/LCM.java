package com.conditions_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = 0;
        int max = Math.max(a, b);

        for (int i = max; i <= a * b; i = i + max) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM of the two numbers is " + lcm);

        int hcf = a*b/lcm;
        System.out.println("HCF of the two numbers is " + hcf);
    }
}
