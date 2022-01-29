/*
    1365. How Many Numbers Are Smaller Than the Current Number

    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.

    link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

package com.arrays;

import java.util.Arrays;

public class NumberSmallerThanCurrentNumber_optimized {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        int[] ans = numberSmallerThanCurrentNumber(nums);
        int[] ans2 = numberSmallerThanCurrentNumber(nums2);
        int[] ans3 = numberSmallerThanCurrentNumber(nums3);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));
    }

    static int[] numberSmallerThanCurrentNumber(int[] nums) {
        int[] res = new int[nums.length];
        int max = Arrays.stream(nums).max().getAsInt();
        int[] freq = new int[max + 1];
        int[] prefixSum = new int[max + 1];

        for (int num : nums) {
            freq[num]++;
        }

        prefixSum[0] = freq[0];
        for (int i = 1; i < max + 1 ; i++) {
            prefixSum[i] = prefixSum[i - 1] + freq[i];
        }

        for (int i = 0 ; i < nums.length ; i++) {
            res[i] = prefixSum[nums[i]] - freq[nums[i]];
        }
        return res;
    }
}
