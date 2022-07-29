package com.arrays;

import java.io.*;
import java.util.*;

public class CountEmirp {

    public static void main(String args[]) throws IOException {
//        int n = 13;
        int[] arr = {1, 13, 2, 31, 17};
        int n = arr.length;
//        int count = 0;
//        for(int i = 0; i<arr.length ; i++) {
//            if (isEmirp(arr[i]) == true) count++;
//        }
        System.out.println(countEmirp(arr,n));
    }

    public static int countEmirp(int[] input1, int input2) {

        int count = 0;
        for (int i = 0; i < input2; i++) {
            if (isEmirp(input1[i]) == true) count++;
        }
        return count;

    }

    public static boolean isEmirp(int n) {
        if (isPrime(n) == false) return false;

        int rev = 0;
        while (n != 0) {
            int x = n % 10;
            rev = rev * 10 + x;
            n /= 10;
        }

        return isPrime(rev);
    }

    public static boolean isPrime(int n) {
        if (n <= 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
