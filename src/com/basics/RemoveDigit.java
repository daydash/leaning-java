// To make the number minimum by removing only one '5' from the number
// Base Condition: The given number will contain at-least one '5'

package com.basics;

import java.lang.Math;

public class RemoveDigit {
    public static void main(String[] args) {
        int n1 = 15958;         // Output -> 1958
        int n2 = -5859;         // Output -> -589
        int n3 = -5000;         // Output -> 0
        int n4 = -905005000;     // Output -> 0
        int n5 = -9000;         // Output -> -9000
        System.out.println(Solution2(n1));
        System.out.println(Solution2(n2));
        System.out.println(Solution2(n3));
        System.out.println(Solution2(n4));
        System.out.println(Solution2(n5));
    }

    static int Solution2(int N){
        int count = 0;
        int td = 0;
        if(N<0){
            N = Math.abs(N);
            td = totalDigits(N);
            count = countZero(N,td);
            N = removeFive(N);
            N = reverse(N);
            N = (int) (N * Math.pow(10,count));
            return N*-1;
        }
        else{
            N = reverse(N);
            N = removeFive(N);
            return N;
        }
    }

    static int totalDigits(int N){
        int td = 0;
        while (N > 0) {
            td++;
            N /= 10;
        }
        return td;
    }

    static int countZero(int N,int td){
        int count = 0;
        while(N>0){

            if(N%10==0){
                count++;
                td--;
                N/=10;
                while(N%10==0 && td!=0) {
                    td--;
                    count++;
                    N /= 10;
                }
            }
            if(N%10==5){
                N/=10;
                while(N%10==0 && td!=0){
                    td--;
                    count++;
                    N/=10;
                }
            }
            break;
        }
        return count;
    }

    static int removeFive(int N) {
        boolean flag = true;
        int count = 0;
        int rev = 0;
        while(N>0){
            if(N%10 == 5 && flag){
                flag = false;
                N/=10;
                continue;
            }
            rev = rev*10 + N%10;
            N/=10;
        }
        return rev;
    }

    static int reverse(int N){
        int rev = 0;
        while(N>0){
            rev = rev*10 + N%10;
            N/=10;
        }
        return rev;
    }



    //    static int Solution(int N){
//
//        if(N<0){
//            N = Math.abs(N);
//            boolean flag = true;
//            int rev = 0;
//            while(N>0){
//                if(N%10 == 5 && flag){
//                    flag = false;
//                    N/=10;
//                    continue;
//                }
//                rev = rev*10 + N%10;
//                N/=10;
//            }
//            N=0;
//            while (rev>0){
//                N = N*10 + rev%10;
//                rev/=10;
//            }
//
//            return N*-1;
//        }
//        else {
//            int rev = 0;
//            boolean flag = true;
//            while(N>0){
//                rev = rev*10 + N%10;
//                N/=10;
//            }
//            N=0;
//            while (rev>0){
//                if(rev%10 == 5 && flag){
//                    flag = false;
//                    rev/=10;
//                    continue;
//                }
//                N = N*10 + rev%10;
//                rev/=10;
//            }
//            return N;
//        }
//    }

}
