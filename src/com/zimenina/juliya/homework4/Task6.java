package com.zimenina.juliya.homework4;

/*
Task 6:
Natural numbers X and Y are given.
Calculate the XY product using only
the addition operator
 */

public class Task6 {
    public static void main(String[] args) {
        int x = 12;
        int y = 6;
        int sum = 0;

        for (int i = 0; i < y; i++) {
            sum += x;
        }

        System.out.println("The product of numbers is: " + sum);
    }
}
