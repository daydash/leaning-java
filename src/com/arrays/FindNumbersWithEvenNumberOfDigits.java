/*
    1295. Find Numbers with Even Number of Digits

    Given an array nums of integers, return how many of them contain an even number of digits.

    link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

package com.arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};

        int ans = findNumbers(nums);
        int ans2 = findNumbers(nums2);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenDigits(nums[i])) cnt++;
        }
        return cnt;
    }

    static boolean isEvenDigits(int n) {
        int cnt = 0; // local variable... doesn't affect the cnt in findNumbers()
        while (n > 0) {
            n /= 10;
            cnt++;
        }
        return (cnt & 1) == 0; // provides a value either true or false because of relational operator, i.e. ==
    }
}
