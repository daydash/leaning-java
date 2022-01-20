package com.basics;

import java.util.Arrays;

public class ChangeFunction {

    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
//            nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
        nums[2] = 69;
//            nums[] = {10, 20, 30, 40, 50};
    }
}