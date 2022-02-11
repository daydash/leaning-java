package com.arrays;

import java.util.Arrays;

public class PrettyPrinting {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int i = 5; // upto 5th element starting from 0th

        System.out.println("Array: " + Arrays.toString(prettyPrint(nums, i)));
    }

    static String[] prettyPrint(int[] nums, int arrLength) {
        String[] stringNums = new String[nums.length];

        for (int i = 0; i < stringNums.length; i++) {
            stringNums[i] = Integer.toString(nums[i]);
        }

        for (int j = arrLength; j < stringNums.length; j++) {
            stringNums[j] = "_";

            // whatever you want to print...
//            stringNums[j] = "null";
//            stringNums[j] = "*";
        }

        return stringNums;
    }
}
