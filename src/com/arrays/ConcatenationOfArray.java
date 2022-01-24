/*
    1929. Concatenation of Array

    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.

    link - https://leetcode.com/problems/concatenation-of-array/
 */

package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int[] nums = new int[6];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }

        int[] nums = {1, 2, 1};
        int[] xnums = {1, 3, 2, 1};

        int[] ans = coa(nums);
        int[] xans = coa(xnums);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(xans));
    }

    static int[] coa(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];

        }

        return ans;
    }
}
