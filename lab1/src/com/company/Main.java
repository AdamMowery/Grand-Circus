package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = false;
        Scanner sc = new Scanner(System.in);
        while (!running) {
            System.out.print("enter length:");
            float length = sc.nextFloat();

            System.out.print("enter width:");
            float width = sc.nextFloat();

            System.out.print("enter height:");
            float height = sc.nextFloat();

            float area = length * width;
            System.out.println("area: " + area);

            float perimeter = length + length + width + width;
            System.out.println("perimeter: " + perimeter);

            float volume = length * width * height;
            System.out.println("volume: " + volume);

            System.out.println("Would you like to measure more rooms? (y/n)");
            String answer = sc.next();
//            if (answer.charAt(0)== 'n')
//                break;
            switch (answer){
                case "y":
                    running = false;
                case "n":
                    running =true;

            }

        }
    }
}
