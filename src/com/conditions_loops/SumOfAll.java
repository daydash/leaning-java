package com.conditions_loops;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the numbers to sum");

        while(true){
            int n = in.nextInt();
            if (n == 0){
                System.out.println("The sum is " + sum);
                return;
            }
            sum += n;
        }
    }
}
