package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {

            // Getting user input.

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the month of the first date as a number.");
            int month = sc.nextInt();
            System.out.println("Please enter the day of the first date.");
            int day = sc.nextInt();
            System.out.println("Please enter the year of the first date.");
            int year = sc.nextInt();
            System.out.println("Please enter the month of the second date as a number.");
            int month1 = sc.nextInt();
            System.out.println("Please enter the day of the second date.");
            int day1 = sc.nextInt();
            System.out.println("Please enter the year of the second date.");
            int year1 = sc.nextInt();
            // Putting all the variables together to compare the dates.
            Timediff user = new Timediff();
            user.userInput(day, day1, month, month1, year, year1);
            // Catch for in case a non-valid response is entered.
        } catch (Exception A) {
            System.out.println("Please enter a valid response.");
        }
    }


}
