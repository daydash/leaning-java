/*
    1572. Matrix Diagonal Sum

    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

    link - https://leetcode.com/problems/matrix-diagonal-sum/
 */

package com.arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] nums3 = {{5}};

        int ans = diagonalSum(nums);
        int ans2 = diagonalSum(nums2);
        int ans3 = diagonalSum(nums3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

/*
    // HINT : A simple 3*3 square matrix is like
              {
                { 00  01  02 }
                { 10  11  12 }
                { 20  21  22 }
                                }
              Let the order of the matrix be 'm'

              Here for the Left Diagonal Sum the condition will be :            i = j           i.e. 00, 11, 22
              Similarly for the Right Diagonal Sum the condition will be :      i + j = m - 1   i.e. 02, 11, 20

              BUT as we have to include the middle element only once then :     (i = j) || ((i + j = m - 1) && (i != j ))       i.e. 00, 11, 22 ; 02, 20
              the above condition can be simplified as :                        (i = j) || (i + j = m - 1)
*/
    static int diagonalSum(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                //next 3 codes will work for the same logic...

                // way to write #1
                if (i == j || i + j == mat.length - 1) ans+=mat[i][j];

                // way to write #2
//                if ((i == j) || ((i + j == mat.length - 1) && (i != j)) ) ans+=mat[i][j];

                // way to write #3
//                if (i == j) ans+=mat[i][j];
//                if ((i + j == mat.length - 1) && (i != j)) ans+=mat[i][j];
            }
        }
        return ans;
    }
}
