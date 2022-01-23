package com.methods;

public class Shadowing2 {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
 // not declared x in this block in this 2nd example
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x); //40
    }
}