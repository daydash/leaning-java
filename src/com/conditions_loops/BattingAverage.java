// Just used the if and if-else statements without blocks in this program

package com.conditions_loops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long Matches, runs, innings, notout;
        double avg;

        System.out.print("Enter the number of matches played: ");
        Matches = sc.nextLong();

        while (true) {
            System.out.print("Enter the number innings batted: ");
            innings = sc.nextLong();
            if (innings <= Matches) break;
            System.out.println("Enter the number innings batted correctly <=matches");

        }

        while (true) {
            System.out.print("Enter number of times Not-out: ");
            notout = sc.nextLong();
            if (notout <= innings) break;
            System.out.println("Enter the number times became Not-out correctly <=innings");
        }

        System.out.print("Enter runs scored: ");
        runs = sc.nextLong();
        if (innings == notout) avg = runs;
        else avg = (float)runs / (innings - notout);
        System.out.println("Batting average is " + avg);

    }
}