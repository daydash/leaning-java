package com.linear_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] array = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19;
//        int ans = linearSearch(array, target);
//        System.out.println(target + " is present at index: " + ans);


        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int target = in.nextInt();

        int ans = linearSearch4(list, target);
        System.out.println("Element found at index: " + ans);

    }

    static int linearSearch4(ArrayList<Integer> list, int target) {
        if (list.isEmpty()) return -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) return i;
        }
        return -1;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {

            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

}