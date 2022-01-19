package com.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = input.nextLine();
        System.out.println("Welcome " + name);
    }
}
