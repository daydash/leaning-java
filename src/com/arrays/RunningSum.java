/*
    1480. Running Sum of 1d Array

    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    link - https://leetcode.com/problems/running-sum-of-1d-array/
 */

package com.arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int[] nums = new int[6];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }

        int[] nums = {1, 2, 3, 4};
        int[] xnums = {1, 1, 1, 1, 1};

        int[] ans = runningsum(nums);
        int[] xans = runningsum(xnums);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(xans));
    }

    static int[] runningsum(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i] += nums[j];
            }
        }

        return arr;
    }
}
