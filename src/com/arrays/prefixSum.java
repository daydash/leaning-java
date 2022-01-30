/*
    Prefix Sum Array

    Given an array arr[] of size n, its prefix sum array is another array prefixSum[]
    of the same size, such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] … arr[i].
 */

package com.arrays;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int n = arr.length;

        int[] reqarr = prefixSum(arr, n);

        System.out.println(Arrays.toString(reqarr));
    }

    static int[] prefixSum(int[] arr, int n) {
        int[] prefSum = new int[n];
//        int[] prefSum = new int[arr.length]; //do not require to pass n if initialize using this.
        prefSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }

        return prefSum;
    }
}
