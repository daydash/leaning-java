package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class AbsoluteSortedArray {

    public static class SortAbsoluteValue {
        // all positive; all negative; positive & negative
        public static void main(String[] args) {
            int[] num = new int[] { -8, -5, -3, -1, 3, 6, 9 };
            int[] num1 = {-8, -3, -1, 0, 1, 3, 7, 9};
            int[] result = sortAbsolute(num1);

            System.out.println(Arrays.toString(result));
        }

        private static int[] sortAbsolute(int[] num) {
            int size = num.length;
            // all positive : leave as is
            if (num[0] >= 0)
                return num;
            // all negative : reverse array
            if (num[size-1] < 0) {
                int[] temp = Arrays.copyOf(num, num.length);
                Arrays.sort(temp);
                return temp;
            }
            int[] result = new int[size];

            int i = 0;
            for (i = 0; i < size - 1; i++) {
                if (num[i] < 0 && num[i + 1] >= 0) {
                    break;
                }
            }

            int left = i - 1;
            int right = i + 1;
            result[0] = num[i];
            int k = 0;
            while (left >= 0 && right < size) {
                if (Math.abs(num[left]) < num[right]) {
                    result[++k] = num[left];
                    left--;
                } else {
                    result[++k] = num[right];
                    right++;
                }
            }
            // remaining left elements, if any
            while(left>=0) {
                result[++k] = num[left--];
            }
            // remaining right elements, if any
            while(right<size) {
                result[++k] = num[right++];
            }
            // if the 0 is present at the 1st index, then swapped the 0th and 1st element
            if(result[1] == 0) {
                int temp = result[0];
                result[0] = result[1];
                result[1] = temp;
            }
            return result;
        }
    }
}
