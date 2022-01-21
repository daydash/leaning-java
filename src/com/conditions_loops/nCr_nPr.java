package com.conditions_loops;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        System.out.print("Enter the value of r: ");
        int r = in.nextInt();

        // without using factorial function
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;

        for (int i = 2; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 2; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 2; i <= (n - r); i++) {
            nrfact *= i;
        }

        System.out.println("nCr is " + nfact / (rfact * nrfact));
        System.out.println("nPr is " + nfact / nrfact);
    }
}
