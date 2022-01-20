package com.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a = in.nextFloat();
        System.out.print("Enter the second number : ");
        float b = in.nextFloat();
        System.out.print("Select the operation (+,-,*,/) : ");
        char ch = in.next().charAt(0);
        float ans;
        if (ch == '+') {
            ans = a + b;
        } else if (ch == '-') {
            ans = a - b;
        } else if (ch == '*') {
            ans = a * b;
        } else if (ch == '/') {
            ans = a / b;
        } else {
            System.out.println("WRONG CHOICE!");
            return;
        }
        System.out.println("Answer is " + ans);
    }
}
