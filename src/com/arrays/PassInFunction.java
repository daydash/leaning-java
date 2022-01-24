package com.arrays;

import java.util.Arrays;

public class PassInFunction {

    public static void main(String[] args) {
        int[] arr = {3, 9, 50, 12};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array) {
        array[0] = 99;
    }
}
