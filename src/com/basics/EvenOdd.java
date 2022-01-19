package com.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        if (n %2==0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }
}
