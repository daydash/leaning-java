/*
1732. Find the Highest Altitude

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

link - https://leetcode.com/problems/find-the-highest-altitude/
 */

package com.arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {

        int[] nums = {-5,1,5,0,-7};
        int[] nums2 = {-4,-3,-2,-1,4,3,2};

        int ans = largestAltitude(nums);
        int ans2 = largestAltitude(nums2);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int largestAltitude(int[] gain) {
        int[] prefSum = new int[gain.length];
        prefSum[0] = gain[0];
        int max = 0;

        for (int i = 1; i < gain.length; i++) {
            prefSum[i] = prefSum[i - 1] + gain[i];
        }

        for (int element : prefSum) {
            if (element > max) max = element;
        }

        return max;
    }
}
