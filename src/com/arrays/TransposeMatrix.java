/*
    867. Transpose Matrix

    Given a 2D integer array matrix, return the transpose of matrix.
    The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

    link - https://leetcode.com/problems/transpose-matrix/
 */

package com.arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};

        int[][] ans = transpose(matrix);
        int[][] ans2 = transpose(matrix2);

        for(int[] a : ans) {
            System.out.println(Arrays.toString(a));
        }

        for(int[] a : ans2) {
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;

    }
}
