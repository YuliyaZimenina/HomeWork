package com.zimenina.juliya.homework4;

/*
Task 4:
Game "Guess". Generate a number from 0 to 100.
The user must guess the resulting number for 7 values.
After each, we display the message "Little" or "Many" (hint for the user).
If after seven values the user could not calculate the number,
hit him about the loss and what number was guessed.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        System.out.println("Let's play a game!\n" +
                "I guessed a number from 0 to 100.\n" +
                "Try to guess it.\n" +
                "Remember! You only have 7 tries!");

        int startNumber = 0;
        int endNumber = 100;

        //Generating a random number
        int randomNumber = startNumber + (int) (Math.random() * endNumber);
        System.out.println(randomNumber); //- check random number
        System.out.println(" ");
        System.out.println("Attempt 1!\n" +
                "Enter your number:");
        userNumber = scanner.nextInt();

        int count = 2; // Retries counter

        for (; count <= 7; count++) {
            if (userNumber < randomNumber) {
                System.out.println("Few! Please enter another number.");
                System.out.println("Attempt " + count + "!");
                userNumber = scanner.nextInt();

            }
            if (userNumber > randomNumber) {
                System.out.println("Too much! Please enter another number.");
                System.out.println("Attempt " + count + "!");
                userNumber = scanner.nextInt();
            } else if (userNumber != randomNumber) {
                if (count == 7) {
                    System.out.println("You lost! Hidden number: " + randomNumber);
                }
            } else {
                    System.out.println("Right! You won!");
                    break;
            }
        }
        scanner.close();
    }
}
