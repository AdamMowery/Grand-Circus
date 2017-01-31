package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = false;
        Scanner sc = new Scanner(System.in);
        while (!running) {
            System.out.print("enter the score: ");
            byte score = sc.nextByte();

            if (score >= 96){
                System.out.println("grade is: A+");
            }else if (score < 96 && score >= 92){
                System.out.println("grade is: A");
            }else if (score < 92 && score >= 88){
                System.out.println("grade is: A-");
            }else if (score < 88 && score >= 85){
                System.out.println("grade is: B+");
            }else if (score < 85 && score >= 82){
                System.out.println("grade is: B");
            }else if (score < 82 && score >= 80){
                System.out.println("grade is: B-");
            }else if (score < 80 && score >= 75){
                System.out.println("grade is: C+");
            }else if (score < 75 && score >= 71){
                System.out.println("grade is: C");
            }else if (score < 71 && score >= 67){
                System.out.println("grade is: C-");
            }else if (score < 67 && score >= 64){
                System.out.println("grade is: D+");
            }else if (score < 64 && score >= 62){
                System.out.println("grade is: D");
            }else if (score < 62 && score >= 60){
                System.out.println("grade is: D-");
            }else if (score < 60){
                System.out.println("grade is: F");
            }

            System.out.print("Would you like to continue? (y/n): ");
            String answer = sc.next();
            if (answer.charAt(0) == 'y'){
                running = false;

            }else if (answer.charAt(0) == 'Y'){
                running = false;

            }else
                break;


        }
    }
}
