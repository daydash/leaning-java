/*
   1920. Build Array from Permutation

   Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
   A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

   link - https://leetcode.com/problems/build-array-from-permutation/
 */

package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] nums = new int[6];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] xnums = {5, 0, 1, 2, 3, 4};

        int[] ans = afp(nums);
        int[] xans = afp(xnums);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(xans));
    }

    static int[] afp(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
