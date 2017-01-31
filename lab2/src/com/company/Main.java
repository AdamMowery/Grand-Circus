package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userInput = "yes";
        try {
        do {

                System.out.println("Please enter a number between 1 and 100.");
                int number = scnr.nextInt();

                if (number < 1 || number > 100) {
                    System.out.println("Please enter a valid number.");
                }
                if (number % 2 == 0 && number > 2 && number < 25) {
                    System.out.println("Even");
                    System.out.println("less than 25");
                } else if (!(number % 2 == 0)) {
                    System.out.println("odd");
                    if (number > 60) {
                        System.out.println(number);
                    }
                } else if (number % 2 == 0 && number > 26 && number <= 60) {
                    System.out.println("Even");
                } else if (number > 60 && number % 2 == 0) {
                    System.out.println("Even " + number);
                }


                System.out.println("Would you like to continue? y/n");
                String answer = scnr.next();
                if (answer.charAt(0) == 'n') {
                    userInput = "no";
                }


            }
            while (userInput.equalsIgnoreCase("yes")) ;

    } catch (Exception a) {
    }

    }
}
