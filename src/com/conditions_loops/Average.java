package com.conditions_loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = in.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int n = in.nextInt();
            sum += n;
        }
        System.out.println("The average is " + ((float) sum / N));
    }
}
