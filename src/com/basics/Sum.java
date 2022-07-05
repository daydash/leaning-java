package com.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t!=0){
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = a+b;
            System.out.println(sum);
            t--;
        }
    }
}
