package com.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum;
        System.out.print("Enter the value of n : ");
        int n = in.nextInt();
        System.out.println("Fibonacci Series upto " + n + " is :");
        System.out.print(a + " " + b + " ");
        for(int i = 2; i<n; i++){
            sum = a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;
    }
    }
}
