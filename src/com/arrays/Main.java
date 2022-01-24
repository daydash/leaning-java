package com.arrays;

public class Main {

    public static void main(String[] args) {

        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers:
//        int[] rnos = new int[5];
          // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]); // 0 (default value)

        String[] arr = new String[4];
        System.out.println(arr[0]); // null (default value)

//        for (String element : arr) {
//            System.out.println(element);
//        }
        int[] yash = {1,2,3,4,5};
        for(int i : yash){
            System.out.print(i + " ");
        }

        System.out.println();

        String[] daydash = {"Yash","og","daydash"};
        for(String i : daydash){
            System.out.print(i+" ");
        }
    }
}