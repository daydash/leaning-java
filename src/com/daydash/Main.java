package com.daydash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // integer division in floating point context
        int x = 5;
        int y = 7;
        float divide = x / y;
        System.out.println(divide);
        divide = (float) x / y;
        System.out.println(divide);

        // String input after any input is taken
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
