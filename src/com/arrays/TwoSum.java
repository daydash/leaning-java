/*
    1. Two Sum

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    link - https://leetcode.com/problems/two-sum/
 */

package com.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};
        int[] nums4 = {-1,-2,-3,-4,-5};

        int target = 9;
        int target2 = 6;
        int target3 = 6;
        int target4 = -8;

        int[] ans = twoSum(nums, target);
        int[] ans2 = twoSum(nums2, target2);
        int[] ans3 = twoSum(nums3, target3);
        int[] ans4 = twoSum(nums4, target4);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));
        System.out.println(Arrays.toString(ans4));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > target) break; // using this condition doesn't provide the output for the negative numbers like in {-1,-2,-3,-4,-5}, target = -8 expOut = {2,4}
                if ((nums[i] + nums[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

}
