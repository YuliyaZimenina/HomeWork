package com.zimenina.juliya.homework3;
/*
Task2:
We generate 2 numbers.
The first is in the range from 1 to 31, the second is from 1 to 12.
We inform the user if the generated date and month are not a valid
date and display them (for example: "Date: February 30 is not a valid date.")
If the date is valid, display it in the format "April 4".
 */

public class Task2 {
    public static void main(String[] args) {
        int date = 1 + ((int)(Math.random() * 31));
        int month = 1 + ((int)(Math.random() * 12));

        // if-else loop to determine date validity
        if (date <= 31 && month ==1){
            System.out.println(" Data: " + date + " January");
        }
        else if (date <= 29 && month ==2) {
            System.out.println(" Date: " + date + " February");
        }
        else if (date <= 31 && month ==3) {
            System.out.println(" Date: " + date + " March");
        }
        else if (date <= 30 && month ==4) {
            System.out.println(" Date: " + date + " April");
        }
        else if (date <= 31 && month ==5) {
            System.out.println(" Date: " + date + " May");
        }
        else if (date <= 30 && month ==6) {
            System.out.println(" Date: " + date + " June");
        }
        else if (date <= 31 && month ==7) {
            System.out.println(" Date: " + date + " July");
        }
        else if (date <= 31 && month ==8) {
            System.out.println(" Date: "  + date + " August");
        }
        else if (date <= 30 && month ==9) {
            System.out.println(" Date: " + date + " September");
        }
        else if (date <= 31 && month ==10) {
            System.out.println(" Date: " + date + " October");
        }
        else if (date <= 30 && month ==11) {
            System.out.println(" Date: " + date + " November");
        }
        else if (date <= 31 && month ==12) {
            System.out.println(" Date: " + date + " December");

            // Condition under which the date is not valid
        }else {
            System.out.println(" Date: " + date + " There is no such date!");
        }
    }
}
