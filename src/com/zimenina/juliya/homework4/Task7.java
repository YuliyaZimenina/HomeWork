package com.zimenina.juliya.homework4;

/*
Task 7:
Write a program to output any number
any given number of times (ask the user).
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int userNumber;
        int iter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        userNumber = scanner.nextInt();
        System.out.println("How many times should it be displayed on the screen?");
        iter = scanner.nextInt();
        System.out.println("Your number will be displayed" + iter +" 12 times.");

        for (int i = 0; i < iter; i++) {
            System.out.println(userNumber + " ");
        }
        scanner.close();
    }
}
