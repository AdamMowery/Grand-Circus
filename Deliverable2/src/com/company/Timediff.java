package com.company;


import java.time.LocalDate;
import java.time.Period;

/**
 * Created by adam on 12/28/2016.
 */
class Timediff {


    void userInput(int day, int day1, int month, int month1, int year, int year1) {
        // Setting the variables to start the calculations.
        int dayCheck = year % 10;
        int dayCheck1 = year1 % 10;
        int dayConvert;

        dayCheck = dayCheck % 4;
        dayCheck1 = dayCheck1 % 4;

        //Running extra checks to see if all the numbers entered are of a valid response.
        if (day <= 31 && day >= 1 && day1 <= 31 && day1 >= 1) {
            if (month <= 12 && month >= 1 && month1 <= 12 && month1 >= 1) {
                if (month != 2 || month1 != 2) {
                    if (month != 4 && month != 6 && month != 9 && month != 11 || month1 != 4 && month1 != 6 && month1 != 9 && month1 != 11) {
                        // Doing the calculations and printing the results.
                        if (year < year1) {
                            LocalDate firstDate = LocalDate.of(year, month, day);
                            LocalDate secondDate = LocalDate.of(year1, month1, day1);

                            Period diff = Period.between(firstDate, secondDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                        }else {
                            LocalDate firstDate = LocalDate.of(year, month, day);
                            LocalDate secondDate = LocalDate.of(year1, month1, day1);

                            Period diff = Period.between(secondDate, firstDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                        }


                    } else if (day < 31 || day1 < 31) {
                        if (year < year1) {
                                LocalDate firstDate = LocalDate.of(year, month, day);
                                LocalDate secondDate = LocalDate.of(year1, month1, day1);

                                Period diff = Period.between(firstDate, secondDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");

                        }else {
                            LocalDate firstDate = LocalDate.of(year, month, day);
                            LocalDate secondDate = LocalDate.of(year1, month1, day1);

                            Period diff = Period.between(secondDate, firstDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                        }
                    }

                } else if (day < 30 || day1 < 30) {
                    if (dayCheck == 0 && dayCheck1 == 0) {
                        if (year < year1) {
                            LocalDate firstDate = LocalDate.of(year, month, day);
                            LocalDate secondDate = LocalDate.of(year1, month1, day1);

                            Period diff = Period.between(firstDate, secondDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                        }else {
                            LocalDate firstDate = LocalDate.of(year, month, day);
                            LocalDate secondDate = LocalDate.of(year1, month1, day1);

                            Period diff = Period.between(secondDate, firstDate);
                            dayConvert = diff.getDays();
                            if (dayConvert<0){
                                dayConvert = dayConvert*-1;
                            }
                            System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                        }
                    } else {
                        if (day < 29 && day1 < 29) {
                            if (year < year1) {
                                LocalDate firstDate = LocalDate.of(year, month, day);
                                LocalDate secondDate = LocalDate.of(year1, month1, day1);

                                Period diff = Period.between(firstDate, secondDate);
                                dayConvert = diff.getDays();
                                if (dayConvert<0){
                                    dayConvert = dayConvert*-1;
                                }
                                System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                            }else {
                                LocalDate firstDate = LocalDate.of(year, month, day);
                                LocalDate secondDate = LocalDate.of(year1, month1, day1);

                                Period diff = Period.between(secondDate, firstDate);
                                dayConvert = diff.getDays();
                                if (dayConvert<0){
                                    dayConvert = dayConvert*-1;
                                }
                                System.out.println("The difference is: " + diff.getYears() + " years " + diff.getMonths() + " months and " + dayConvert + " days ");
                            }
                        } else {
                            System.out.print("The day you entered for one or more of your dates was not valid please enter a valid day. 3");
                        }
                    }

                } else if (day > 29 || day1 > 29) {
                    System.out.print("The day you entered for one of your dates was not valid please enter a valid day. 2");
                }
            }
            if (month > 12 || month < 1 || month1 > 12 || month1 < 1) {
                System.out.print("The month you entered for one or more of your dates was not valid please enter a valid month.");
            }
        }
        if (day > 31 || day < 1 || day1 > 31 || day1 < 1) {
            System.out.print("The day you entered for one of your dates was not valid please enter a valid day. 1");
        }

    }

}
