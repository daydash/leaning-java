/*
    1512. Number of Good Pairs

    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    link - https://leetcode.com/problems/number-of-good-pairs/
 */

package com.arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};

        int ans = goodPairs(nums);
        int ans2 = goodPairs(nums2);
        int ans3 = goodPairs(nums3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int goodPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if ((nums[i] == nums[j] && ((i < j)))) ans++;
            }
        }
        return ans;
    }
}
