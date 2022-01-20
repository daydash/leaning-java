package com.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle Amount : ");
        float p = in.nextFloat();
        System.out.print("Enter the Rate : ");
        float r = in.nextFloat();
        System.out.print("Enter the Time : ");
        float t = in.nextFloat();

        float si = p * r * t / 100;
        System.out.println("Simple Interest is " + si);
    }
}
