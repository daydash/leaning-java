package com.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey Yash");

//        use of modulus operator %

//        smaller % greater = smaller
//        equal % equal = 0

        System.out.println(9 % 5);          // 4
        System.out.println(9.0 % 5);        // 4.0
        System.out.println(9.1 % 5);        // 4.1
        System.out.println(9.1 % 5.1);      // 4.0
        System.out.println(9.1 % 5.3);      // 3.8
        System.out.println(5 % 5);          // 0
        System.out.println(-15 % 2);        // -1
        System.out.println(15 % -2);        // 1
        System.out.println(0.3 % 0.5);      // 0.3
        System.out.println(0.5 % 0.3);      // 0.2

        char ch1 = 'Y';
        char ch2 = 88; // ASCII value of X
        System.out.println(ch1 + " " + ch2); //X Y

        System.out.println('a' + 1);        // 98       - ASCII value of a is 97, so 97+1=98
        System.out.println('a' + '1');      // 146      - ASCII value of a is 97 & '1' is 49, so 97+49=146
        System.out.println("a + 1");        // a + 1    - string

        // Specify integer using its binary code with prefix as 0b or 0B, 1010(in binary) = 10(in decimal)
        int x = 0B1010;
        System.out.println("x = " + x);

        // Specify integer using its hexadecimal code with prefix as 0x or 0X, A(in hexadecimal) = 10(in decimal)
        int y = 0xA;
        System.out.println("y = " + y);

        // integer division in floating point context
        int p = 5;
        int q = 7;
        float divide = p/q;
        System.out.println(divide);
        divide = (float) p/q;
        System.out.println(divide);

        // What is inside the 'in'
        Scanner in = new Scanner(System.in);
        System.out.println(in);  // java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
    }
}
