package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            // New scanner created.
            Scanner scnr = new Scanner(System.in);

            // Asking for user input.
            System.out.print("please enter a number: ");

            // Reading the user input.
            int value = scnr.nextInt();

            // Letting the user know what is actually happening / Asking if they want to continue.
            System.out.println(" ");
            System.out.println("I am now going to take your number and check to see"
                    + " if all the digits cubed then added together equals itself.");
            System.out.println("Do you want to continue?");
            System.out.print("Enter 1 to continue" + " 2 to exit: ");
            int answer = scnr.nextInt();
            System.out.println(" ");
            // Running a switch statement to either complete the program or end it early.
            switch (answer) {
                case 1:
                    // Printing out the results of the test in the form of true or false.
                    System.out.println("The result I received was: " + new Math().calculations(value));
                    break;
            }
            // Exception for in case the user input is not what was expected.
        } catch (Exception A) {
            System.out.println("That is not a valid entry.");
        }

        System.out.println("Goodbye!");

    }


}
