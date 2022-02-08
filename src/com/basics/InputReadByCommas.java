package com.basics;

import java.util.Scanner;

public class InputReadByCommas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.useDelimiter("\\D");     //   \d matches any digit. The extra \ in \\d is used to escape the backslash from the string

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(a + " " + b + " " + c);
        in.close();


        // another approach
/*
        String line;
        String[] lineVector;

        line = in.nextLine(); //read 1,2,3

        //separate all values by comma
        lineVector = line.split(",");

        //parsing the values to Integer
        int a = Integer.parseInt(lineVector[0]);
        int b = Integer.parseInt(lineVector[1]);
        int c = Integer.parseInt(lineVector[2]);

        System.out.println(a + " " + b + " " + c);

 */

    }
}
