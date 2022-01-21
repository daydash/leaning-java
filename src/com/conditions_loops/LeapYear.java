package com.conditions_loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        int year = in.nextInt();
        boolean ans = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) ans = true;
            }
        }

        if (ans) System.out.println(year + " is a leap year");
        else System.out.println(year + " is a not leap year");
    }
}
