/*
    1431. Kids With the Greatest Number of Candies

    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
    Note that multiple kids can have the greatest number of candies.

    link - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */

package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,3};
        int n = 3;
        int[] nums2 = {4,2,1,1,2};
        int n2 = 1;
        int[] nums3 = {12,1,12};
        int n3 = 10;

        ArrayList<Boolean> ans = greatestCandies(nums, n);
        ArrayList<Boolean> ans2 = greatestCandies(nums2, n2);
        ArrayList<Boolean> ans3 = greatestCandies(nums3, n3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

        System.out.println("\n");

        // another approach
        ArrayList<Boolean> xans = greatestCandies2(nums, n);
        ArrayList<Boolean> xans2 = greatestCandies2(nums2, n2);
        ArrayList<Boolean> xans3 = greatestCandies2(nums3, n3);

        System.out.println(xans);
        System.out.println(xans2);
        System.out.println(xans3);
    }

    static ArrayList<Boolean> greatestCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> ans = new ArrayList<>(1);

        for (int i = 0; i < candies.length; i++) {

//            these comments are just for the problem logic, i.e. for my personal use...
//            int candy = ans.get(i) + extraCandies;
//                    ans.set(i, candy);

            // modifying temp array everytime for getting the original array back
//            int[] temp = candies; // here, temp becomes the reference variable for the objects of candies BUT we need a different array with the same objects as of candies
            // for that purpose using a loop to copy the values
            int[] temp = new int[candies.length];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = candies[j];
            }
            // adding extraCandies for each element for testing
            temp[i] += extraCandies;
            // check if the value becomes the largest, if yes returns true;
            if(isLargest(temp,temp[i])) ans.add(true);
            else ans.add(false);

        }
            return ans;
    }

    static boolean isLargest(int[] temp, int i) {
        for (int j = 0; j < temp.length; j++) {
            if(temp[j] > i) return false;
        }
        return true;
    }

    // another approach
    private static ArrayList<Boolean> greatestCandies2(int[] candies, int extraCandies) {
        ArrayList<Boolean> xans = new ArrayList<>();
        int max = 0;
        for (int i: candies){
            if (max < i) max = i;
        }
        for (int i = 0; i < candies.length ; i++){
            if (candies[i]+extraCandies>= max) xans.add(true);
            else xans.add(false);
        }
        return xans;
    }
}
