package com.basics;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        double inr = in.nextDouble();
        double usd = inr/74.84;  //Assuming the rate as 74.84 (19th Jan, 2022)
        System.out.print("₹" + inr + " in USD are $");
        System.out.format("%.3f",usd);
    }
}
