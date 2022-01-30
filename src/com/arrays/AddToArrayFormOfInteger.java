package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {

        int[] nums = {1, 2, 0, 0};
        int[] nums2 = {2, 7, 4};
        int[] nums3 = {2, 1, 5};
        int[] nums4 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        int k = 34;
        int k2 = 181;
        int k3 = 806;
        int k4 = 1;

        ArrayList<Integer> ans = addToArrayForm(nums, k);
        ArrayList<Integer> ans2 = addToArrayForm(nums2, k2);
        ArrayList<Integer> ans3 = addToArrayForm(nums3, k3);
        ArrayList<Integer> ans4 = addToArrayForm(nums4, k4);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

    }

    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>(num.length);
        long number = 0; // int -> long
        for (int i = 0; i < num.length; i++) {
            number += num[i] * Math.pow(10, num.length - 1 - i);
        }
        long sum = number + k; // int -> long
        while (sum > 0) {
            int digit = (int)(sum % 10); // cast to int
//            ans.add(num.length-1,digit); // (IGNORE) logic is partially-correct but the array is empty... like {null,null,null,null, digit} // also the index will remain same ans will not get update for the next value...
            ans.add(digit);
            sum /= 10;
        }
        Collections.reverse(ans); // basically reverse the ArrayList, reverse(ref_var) is a part of the collection framework
        return ans;
    }
}
