/*
    989. Add to Array-Form of Integer

    The array-form of an integer num is an array representing its digits in left to right order.
    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

    link - https://leetcode.com/problems/add-to-array-form-of-integer/
 */

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
        int[] nums5 = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int[] nums6 = {9,9,9};

        int k = 34;
        int k2 = 181;
        int k3 = 806;
        int k4 = 1;
        int k5 = 516;
        int k6 = 36;

        ArrayList<Integer> ans = addToArrayForm(nums, k);
        ArrayList<Integer> ans2 = addToArrayForm(nums2, k2);
        ArrayList<Integer> ans3 = addToArrayForm(nums3, k3);
        ArrayList<Integer> ans4 = addToArrayForm(nums4, k4);
        ArrayList<Integer> ans5 = addToArrayForm(nums5, k5);
        ArrayList<Integer> ans6 = addToArrayForm(nums6, k6);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(ans6);

    }

    // the value are going beyond the size for test case - 5
    /*
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

     */

    // more optimised solution (still not the best)
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>(num.length);
        for (int i = num.length - 1; i >= 0; --i) {
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
//        System.out.println(ans + "\t<- in"); // manually debugged for better understanding
        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }
}
