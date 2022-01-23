package com.methods;

public class Overloading {
    public static void main(String[] args) {
//        yash(67);
//        yash("daydash");
        int ans = yash(3, 4, 78);
        System.out.println(ans);
    }

    static int yash(int a, int b) {
        return a + b;
    }

    static int yash(int a, int b, int c) {
        return a + b + c;
    }

    static void yash(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void yash(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}