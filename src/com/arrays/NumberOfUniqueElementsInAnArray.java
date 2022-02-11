/*
    Problem Statement

    Find the number of unique elements present in the array.
    Provided that the array is in the ascending order

 */

package com.arrays;

public class NumberOfUniqueElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums3 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3};

        int ans = uniqueElement(nums);
        int ans2 = uniqueElement(nums2);
        int ans3 = uniqueElement(nums3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int uniqueElement(int[] nums) {
        int k = 1;

        // Base conditions
        if (nums.length == 0 || nums == null) return 0;
        if (nums.length == 1) return 1;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i]) k++;

        }

        return k;
    }
}
