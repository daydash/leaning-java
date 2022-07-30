package com.arrays;

import java.util.*;
import java.lang.*;


public class LiteraryCompetition {

    static int Books(int input1,int input2,int[] input3,int[] input4){
//         n = input1;
//         w = input2;
//        int val[] = {}
//        int wt[] = {};
        return solution(input2,input4,input3,input1);
    }

    static int solution(int W, int wt[], int val[], int n)
    {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return solution(W, wt, val, n - 1);
        else
            return Math.max(val[n - 1] + solution(W - wt[n - 1], wt, val, n - 1), solution(W, wt, val, n - 1));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//        int n = 3;
//        int W = 7;
//        int val[] = {2,6,9};
//        int wt[] = {3,5,3};

        int n = 2;
        int W = 5;
        int val[] = {2,4};
        int wt[] = {3,5};

        System.out.println(Books(n,W,val,wt));
    }
}
