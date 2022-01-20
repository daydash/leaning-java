// This program is made such that 0 is only for exiting the program, so that to compare negative numbers
// for this program also works for 0 along with ending with 0, change the loop, lines (25-34) with this code
/*
            while(true){
                int n = in.nextInt();
                if (n == 0){
                    System.out.println("The largest number is " + max);
                    return;
                }
                if (n>max){
                    max = n;
                }
            }
 */
package com.conditions_loops;

import java.util.Scanner;

public class LargestOfAll {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the numbers to find the largest one:");
            int max = in.nextInt(); // assumed that the first number is the largerst

            while(true){
                int n = in.nextInt();
                if (n == 0){
                    System.out.println("The largest number is " + max);
                    return;
                }
                if (n>max){
                    max = n;
                }
            }
        }
}
