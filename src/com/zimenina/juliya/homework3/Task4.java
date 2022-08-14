package com.zimenina.juliya.homework3;
/*
Generate a number from 0 to 100.
The user must guess the resulting number in 7 attempts.
 After each attempt, we display the message "Little" or "Many" (hint for the user).
If after seven attempts the user could not guess the number,
tell him about the loss and what number was guessed.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        //System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number generated. Try to guess the number!");
        System.out.println("Please enter your number:");
        int userNumber = scanner.nextInt();
        int attempt = 0;

        do {
            if (userNumber < randomNumber) {
                System.out.println("Few! Try again!");
                userNumber = scanner.nextInt();
                if (attempt == 6) {
                    break;
                }
                attempt++;
            } else if (userNumber > randomNumber) {
                System.out.println("A lot of! Try again!");
                userNumber = scanner.nextInt();
                if (attempt == 6) {
                    break;
                }
                attempt++;
            } else if (userNumber == randomNumber) {
                System.out.println("You're right!");
                break;
            }
        } while (attempt < 6);
        if (attempt == 6) {
            System.out.println("You've exhausted all attempts! Hidden number: " + randomNumber);
        }
    }
}


