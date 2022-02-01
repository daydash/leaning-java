/*
    66. Plus One

    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.

    link - https://leetcode.com/problems/plus-one/
 */

package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] nums2 = {4, 3, 2, 1};
        int[] nums3 = {9};

        int[] ans = plusOne(nums);
        int[] ans2 = plusOne(nums2);
        int[] ans3 = plusOne(nums3);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));

        // using the ArrayList for the same question as from question 989. Add to Array-Form of Integer, link - https://leetcode.com/problems/add-to-array-form-of-integer/
//        int k = 1;
//        int k2 = 1;
//        int k3 = 1;
//
//        ArrayList<Integer> ans = plusOne(nums, k);
//        ArrayList<Integer> ans2 = plusOne(nums2, k2);
//        ArrayList<Integer> ans3 = plusOne(nums3, k3);


    }

    // Main code !!
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    // code using ArrayList (not optimized)
    static ArrayList<Integer> plusOne(int[] num, int k) {
//        int k = 1; // can be also define 'k' here
        ArrayList<Integer> ans = new ArrayList<>(num.length);
        for (int i = num.length - 1; i >= 0; --i) {
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }
}
