///*
//    1389. Create Target Array in the Given Order
//
//    Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//        * Initially target array is empty.
//        * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//        * Repeat the previous step until there are no elements to read in nums and index.
//
//    Return the target array.
//    It is guaranteed that the insertion operations will be valid.
//
//    link - https://leetcode.com/problems/create-target-array-in-the-given-order/
// */
//
//package com.arrays;
//
//import java.util.Arrays;
//
//public class CreateTargetArrayInTheGivenOrder {
//    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1 };
//        int[] nums2 = {1,2,3,4,0};
//        int[] index2 = {0,1,2,3,0};
//        int[] nums3 = {1};
//        int[] index3 = {0};
//
//        int[] ans = createTargetArray(nums,index);
//        int[] ans2 = createTargetArray(nums2, index2);
//        int[] ans3 = createTargetArray(nums3, index3);
//
//        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(ans2));
//        System.out.println(Arrays.toString(ans3));
//    }
//
//    static int[] createTargetArray(int[] nums, int[] index) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < index.length; j++) {
//                ans[index[i]] = nums[i];
//            }
//            }
//
//        }
//        return ans;
//    }
//}
