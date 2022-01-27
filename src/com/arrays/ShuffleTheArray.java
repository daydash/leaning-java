/*
    1470. Shuffle the Array

    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    link - https://leetcode.com/problems/shuffle-the-array/
 */

package com.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;

        int[] ans = shuffle(nums, n);
        int[] ans2 = shuffle(nums2, n2);
        int[] ans3 = shuffle(nums3, n3);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) ans[i] = nums[i / 2];
            else ans[i] = nums[n + i / 2];
        }
        return ans;
    }
}
