package com.arrays;

import java.util.Arrays;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] position = {1, 2, 3};
        int[] position2 = {2, 2, 2, 3, 3};
        int[] position3 = {1, 1000000000};

        int ans = minCostToMoveChips2(position);
        int ans2 = minCostToMoveChips2(position2);
        int ans3 = minCostToMoveChips2(position3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int minCostToMoveChips(int[] position) {
        int ans = 0;
        int max = Arrays.stream(position).max().getAsInt();
        boolean isEven= false;
        if ((position.length & 1) != 1) isEven = true;



        return ans;
    }

    static int minCostToMoveChips2(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i : position) {
            if ((i & 1) != 1) {
                even++;
            } else {
                odd++;
            }
        }
        if (even == position.length || odd == position.length)
            return 0;
        return Math.min(odd, even);
    }
}
