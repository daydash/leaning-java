package com.conditions_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = in.next().trim().charAt(0);

        // simple method
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Lowercase");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("Uppercase");
//        }
//        else{
//            System.out.println("Invalid choice");
//        }

        // using the ASCII values
        if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid choice");
        }

    }
}