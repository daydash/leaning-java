package com.basics;

public class CmdLineArgs {

    // the code is to be run in terminal
    public static void main(String[] args) {

        // if no arguments are passed then while running then it will print "No Values"
        if(args.length == 0){
            System.out.print("No values");
        }

        // if arguments are passed with it, it will end up print the argument separated by commas
        else{
            for(int i = 0; i < args.length - 1 ; i++){
                System.out.print(args[i] + ",");
            }
            System.out.print(args[args.length - 1]);
        }
    }
}
