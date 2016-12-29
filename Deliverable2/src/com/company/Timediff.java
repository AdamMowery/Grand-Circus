package com.company;


/**
 * Created by adam on 12/28/2016.
 */
class Timediff {


    void userInput(int day, int day1, int month, int month1, int year, int year1) {
        int dayCheck = year % 10;
        int dayCheck1 = year1 % 10;
        int differenceMonth;
        int differenceYear;
        int differenceDay;
        dayCheck = dayCheck % 4;
        dayCheck1 = dayCheck1 % 4;

        if (day <= 31 && day > 1 && day1 <= 31 && day1 > 1) {
            if (month <= 12 && month >= 1 && month1 <= 12 && month1 >= 1) {
                if (month != 2 || month1 != 2) {
                    if (month != 4 && month != 6 && month != 9 && month != 11 || month1 != 4 && month1 != 6 && month1 != 9 && month1 != 11) {
                        if (day >= day1) {

                            differenceDay = day - day1;
                        } else {
                            differenceDay = day1 - day;
                        }

                        if (year >= year1) {
                            differenceYear = year - year1;
                        } else {
                            differenceYear = year1 - year;
                        }
                        if (month >= month1) {
                            differenceMonth = month - month1;
                        } else {
                            differenceMonth = month1 - month;
                        }
                        System.out.println("The difference is: ");
                        System.out.print(differenceDay + "-days ");
                        System.out.print(differenceMonth + "-months ");
                        System.out.print(differenceYear + "-years");


                    } else if (day < 31 || day1 < 31) {
                        if (day >= day1) {
                            differenceDay = day - day1;
                        } else {
                            differenceDay = day1 - day;
                        }
                        if (year >= year1) {
                            differenceYear = year - year1;
                        } else {
                            differenceYear = year1 - year;
                        }
                        if (month >= month1) {
                            differenceMonth = month - month1;
                        } else {
                            differenceMonth = month1 - month;
                        }
                        System.out.println("The difference is: ");
                        System.out.print(differenceDay + "-days ");
                        System.out.print(differenceMonth + "-months ");
                        System.out.print(differenceYear + "-years");


                    }

                } else if (day < 30 || day1 < 30) {
                    if (dayCheck == 0 && dayCheck1 == 0) {
                        if (day >= day1) {
                            differenceDay = day - day1;
                        } else {
                            differenceDay = day1 - day;
                        }
                        if (year >= year1) {
                            differenceYear = year - year1;
                        } else {
                            differenceYear = year1 - year;
                        }
                        if (month >= month1) {
                            differenceMonth = month - month1;
                        } else {
                            differenceMonth = month1 - month;
                        }
                        System.out.println("The difference is: ");
                        System.out.print(differenceDay + "-days ");
                        System.out.print(differenceMonth + "-months ");
                        System.out.print(differenceYear + "-years");

                    } else {
                        if (day < 29 && day1 < 29) {
                            if (day >= day1) {
                                differenceDay = day - day1;
                            } else {
                                differenceDay = day1 - day;
                            }
                            if (year >= year1) {
                                differenceYear = year - year1;
                            } else {
                                differenceYear = year1 - year;
                            }
                            if (month >= month1) {
                                differenceMonth = month - month1;
                            } else {
                                differenceMonth = month1 - month;
                            }
                            System.out.println("The difference is: ");
                            System.out.print(differenceDay + "-days ");
                            System.out.print(differenceMonth + "-months ");
                            System.out.print(differenceYear + "-years");

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
