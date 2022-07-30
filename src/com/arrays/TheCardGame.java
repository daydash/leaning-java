package com.arrays;

public class TheCardGame {

    static int Cards(int input1, int[] input2) {
        int mins = Integer.MAX_VALUE;
        int s = 0;
        int cs = 0;
        for (int i = 0; i < input1; i++) {
            s += input2[i];
            cs = cs + input2[i];
            if (cs < mins)
                mins = cs;
            if (cs > 0)
                cs = 0;
        }
        return (s + (mins * (-2)));
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
        int n = 5;
//        int a[] = {-2, 3, -1, -4, -2};
        int a[] = {-1,2,3,4,-5};
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            sum += a[i];
//        }
        int min_sum = Cards(n, a);
//        int ans = sum + (min_sum * (-2));
        System.out.println(min_sum);
    }

}
