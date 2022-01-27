package com.arrays;

import java.util.ArrayList;

public class CountItemsMatchingARule {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        list.get(0).add(0, "phone");
        list.get(0).add(1, "blue");
        list.get(0).add(2, "pixel");
        list.get(1).add(0, "computer");
        list.get(1).add(1, "silver");
        list.get(1).add(2, "lenovo");
        list.get(2).add(0, "phone");
        list.get(2).add(1, "gold");
        list.get(2).add(2, "iphone");

        String ruleKey = "color";
        String ruleValue = "silver";

        // ArrayList second example
        ArrayList<ArrayList<String>> list1 = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        list1.get(0).add(0, "phone");
        list1.get(0).add(1, "blue");
        list1.get(0).add(2, "pixel");
        list1.get(1).add(0, "computer");
        list1.get(1).add(1, "silver");
        list1.get(1).add(2, "phone");
        list1.get(2).add(0, "phone");
        list1.get(2).add(1, "gold");
        list1.get(2).add(2, "iphone");

        String ruleKey1 = "type";
        String ruleValue1 = "phone";

        // Function calling
        int ans = countMatches(list, ruleKey, ruleValue);
        int ans2 = countMatches(list1, ruleKey1, ruleValue1);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int countMatches(ArrayList<ArrayList<String>> list, String ruleKey, String ruleValue) {
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            if (ruleKey.equals("type") && list.get(i).get(0).equals(ruleValue)) ans++;
            else if (ruleKey.equals("color") && list.get(i).get(1).equals(ruleValue)) ans++;
            else if (ruleKey.equals("name") && list.get(i).get(2).equals(ruleValue)) ans++;
        }
        return ans;
    }
}
