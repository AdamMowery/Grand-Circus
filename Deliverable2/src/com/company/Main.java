package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {


            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the month of the first date.");
            int month = sc.nextInt();
            System.out.println("Please enter the day of the first date.");
            int day = sc.nextInt();
            System.out.println("Please enter the year of the first date.");
            int year = sc.nextInt();
            System.out.println("Please enter the month of the second date.");
            int month1 = sc.nextInt();
            System.out.println("Please enter the day of the second date.");
            int day1 = sc.nextInt();
            System.out.println("Please enter the year of the second date.");
            int year1 = sc.nextInt();
            Timediff user = new Timediff();
            user.userInput(day, day1, month, month1, year, year1);

        } catch (Exception A) {
            System.out.println("Please enter a valid response.");
        }
    }


}
