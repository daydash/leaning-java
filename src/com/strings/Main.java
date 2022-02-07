package com.strings;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String name = "daydash";
        System.out.println(name);

        String a = "Yash";
        System.out.println(a);
        a = "Bhatnagar";       // Not modified the object as wkt string are immutable, instead creating a new object in the pool
        System.out.println(a);

        // the questions arise here is that...
        // where does the original object "Yash" goes when "Bhatnagar" is made and a(ref. variable) is now pointing toward "Bhatnagar" meanwhile "Yash" has no reference variable???
        // The very cool and short answer to that is: Garbage Collector #RIPCpp #JavaVsC++
    }
}
