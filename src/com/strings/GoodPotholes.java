// In order to make the string good we need to remove all X.
// Our task is to count the number of time we need to repair the potholes
// At once three consecutive X can be repaired

package com.strings;
import java.lang.String;

public class GoodPotholes {
    public static void main(String[] args) {
        String S1 = ".X..X";                 // Output -> 1958
        String S2 = "X.XXXXX.X.";           // Output -> 1958
        String S3 = "XX.XXX..";             // Output -> 1958
        String S4 = "XXXX";                 // Output -> 1958
        String S5 = ".X..X..XXX";           // Output -> 1958

        System.out.println(Solution(S1));
        System.out.println(Solution(S2));
        System.out.println(Solution(S3));
        System.out.println(Solution(S4));
        System.out.println(Solution(S5));
    }

    static int Solution(String S){
        int count = 0;
        int i = 0;
        while(i<S.length()){
            if(S.charAt(i)=='X'){
                i+=3;
                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
