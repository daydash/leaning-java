package com.arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] nums2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};


        int[][] ans = flipAndInvertImage(nums);
        int[][] ans2 = flipAndInvertImage(nums2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
        for (int i = 0; i < ans2.length; i++) {
            System.out.println(Arrays.toString(ans2[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
//        int[][] ans = new int[image.length][];
        int[][] ans = image;

        for (int[] i : image) {
            reverse(i);
            for (int j = 0; j < i.length; j++) {
                if (i[j] == 0) i[j] = 1;
                else i[j] = 0;
            }
        }
        return ans;
    }

    // used the return-type void as here the original object is getting modified and that will reflect the change globally
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // used the return-type void as here the original object is getting modified and that will reflect the change globally
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
