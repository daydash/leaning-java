package com.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        yash();
//        multiple(2, 3, "yash", "daydash", "bhatnagar");
//        daydash();
        daydash(1,9,1,1);
    }

    static void daydash(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void daydash(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void yash(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}