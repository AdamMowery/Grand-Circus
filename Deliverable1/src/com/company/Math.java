package com.company;

import java.util.ArrayList;

/**
 * Created by adam on 12/27/2016.
 */
class Math {
    // Created the array list to hold the individual numbers.
    private static ArrayList<Integer> digit = new ArrayList<>();

    // Taking apart the number the user entered.
    boolean calculations(int number) {
        int total = 0;
        int original = number;
        while (number > 0) {
            digit.add(number % 10);
            number = number / 10;
            // Optional display of the array layout for debug.
            // System.out.println(digit);
        }
        // Getting the total of the numbers then comparing it to the original number the user entered
        for (int i = 0; i < digit.size(); i++) {
            int math = digit.get(i) * digit.get(i) * digit.get(i);
            total = total + math;
        }
        if (total == original) {
            return true;
        }
        return false;

    }


}
