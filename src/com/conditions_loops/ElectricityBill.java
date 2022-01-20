//        Constraints:
//        1 to 100 units – Rs. 10/unit
//        101 to 200 units – Rs. 15/unit
//        201 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit

package com.conditions_loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        float unit = in.nextFloat();
        int cost = 0;

        if (unit > 0) {
            if (unit > 1 && unit <= 100) {
                cost = 10;
            } else if (unit > 100 && unit <= 200) {
                cost = 15;
            } else if (unit > 200 && unit <= 300) {
                cost = 20;
            } else {
                cost = 25;
            }
        }

        System.out.println("The cost is Rs. " + (unit*cost));
    }
}
