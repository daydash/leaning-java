///*
//    1252. Cells with Odd Values in a Matrix
//
//    There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//    For each location indices[i], do both of the following:
//        * Increment all the cells on row ri.
//        * Increment all the cells on column ci.
//    Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//
//    link - https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
// */
//
//package com.arrays;
//
//import java.util.Arrays;
//
//public class CellswithOddValuesInAMatrix {
//    public static void main(String[] args) {
//        int[][] nums = {{0, 1}, {1, 1}};
//        int[][] nums2 = {{1, 1,}, {0, 0}};
//
//        int m = 2;
//        int n = 3;
//
//        int m2 = 2;
//        int n2 = 2;
//
//
//        int ans = oddCells(m, n, nums);
//        int ans2 = oddCells(m2, n2, nums2);
//
//        System.out.println(ans);
//        System.out.println(ans2);
//
//        System.out.println(oddCells(m, n, nums));
//    }
//
//    static int oddCells(int m, int n, int[][] indices) {
//        int[][] matrix = new int[m][n];
//
//        for (int i = 0; i < indices.length; i++) {
//            for (int j = 0; j < indices[i].length; j++) {
//
//                if ((j % 2 == 0){
//                    for (int k = 0; k < matrix[; k++) {
//
//                    }
//                }
//            }
//        }
//        return 0;
//    }
//}
