package com.daydash;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

// integer division in floating point context
        int x = 5;
        int y = 7;
        float divide = x/y;
        System.out.println(divide);
        divide = (float) x/y;
        System.out.println(divide);

    }
}
