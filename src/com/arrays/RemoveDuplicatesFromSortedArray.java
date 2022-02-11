/*
    26. Remove Duplicates from Sorted Array

    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
    Return k after placing the final result in the first k slots of nums.
    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

    // Custom Judge:
        The judge will test your solution with the following code:
            int[] nums = [...]; // Input array
            int[] expectedNums = [...]; // The expected answer with correct length
            int k = removeDuplicates(nums); // Calls your implementation
            assert k == expectedNums.length;
            for (int i = 0; i < k; i++) {
                assert nums[i] == expectedNums[i];
            }
        If all assertions pass, then your solution will be accepted.

    link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */



package com.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int ans = removeDuplicates(nums);
        int ans2 = removeDuplicates(nums2);

        System.out.println(ans);
        System.out.println(ans2);
    }

    // Two-pointer approach (returning with the proper required array)
    static int removeDuplicates(int[] nums) {

        // Base conditions
        if (nums.length == 0 || nums == null) return 0;
        if (nums.length == 1) return 1;

        // create two pointers, each pointing to the current and current + 1 index
        int i = 0;
        int j = 1;

        /*
        start our pointers from i = 0 and j = 1
        the idea is that we keep j walking as long as nums[j] == nums[i] in which case, if nums[i] != nums[j], we now increment i, then replace the duplicated nums[i] with the new non-duped element, nums[j]. Then return i + 1
        we employ a while loop because we increment our pointers based on the (in)equalities.
        */

        while (i < nums.length && j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        // System.out.println(Arrays.toString(nums));
        System.out.println("New Array: " + Arrays.toString(prettyPrint(nums, i + 1)));
        return i + 1;
    }

    static String[] prettyPrint(int[] nums, int arrLength) {
        String[] stringNums = new String[nums.length];

        for (int i = 0; i < stringNums.length; i++) {
            stringNums[i] = Integer.toString(nums[i]);
        }

        for (int j = arrLength; j < stringNums.length; j++) {
            stringNums[j] = "_";
        }

        return stringNums;
    }

    // Another Approach (Not Applicable for this question)
    // faster approach just to get the number of unique element but not arranging them.
    static int removeDuplicates2(int[] nums) {
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
