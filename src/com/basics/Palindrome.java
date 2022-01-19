package com.basics;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.next();

        /* this program is case-sensitive
        to make is independent of it use the command as follows */
        // str = str.toLowerCase();

        //checking whether the str is 'NOT' palindrome
        for (int i = 0; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println(str + " is NOT palindrome");
                return;
            }
        }

        System.out.println(str + " is Palindrome");
    }
}
