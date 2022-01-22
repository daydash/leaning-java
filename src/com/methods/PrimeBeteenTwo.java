package com.methods;

import java.util.Scanner;

public class PrimeBeteenTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            prime(i);
        }
    }

    private static void prime(int n) {
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return;
            c++;
        }
        if (c * c > n) {
            System.out.print(n + " ");
        }
    }
}
