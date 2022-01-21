package com.conditions_loops;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;
import java.util.SplittableRandom;

public class ReverseString {
    public static void main(String[] args) {

        // Aam Zindagi
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.next();
        String newstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newstr = ch + newstr;
        }
        System.out.println("Reversed string: " + newstr);

        // Mentos Zindagi
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String str = in.next();
//        StringBuilder newstr = new StringBuilder();
//        newstr.append(str);
//        newstr.reverse();
//        System.out.println("Reversed string: " + newstr);
    }
}