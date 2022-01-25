/*
    1672. Richest Customer Wealth

    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

    link - https://leetcode.com/problems/richest-customer-wealth/
 */


package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int[][] nums = new int[6];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }

        int[][] nums = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int[][] xnums = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int ans = afp(nums);
        int xans = afp(xnums);

        System.out.println(ans);
        System.out.println(xans);
    }

    static int afp(int[][] accounts) {
        int[] ansarr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                ansarr[i] += accounts[i][j];
            }
        }
        int ans = max(ansarr);
        return ans;
    }

    static int max(int[] ansarr) {
        int ans = ansarr[0];
        for (int i = 1; i < ansarr.length; i++) {
            if (ansarr[i] > ans) ans = ansarr[i];
        }
        return ans;
    }
}
