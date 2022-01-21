package com.conditions_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 0;

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of the two numbers is " + hcf);

        int lcm = a*b/hcf;
        System.out.println("LCM of the two numbers is " + lcm);
    }
}
