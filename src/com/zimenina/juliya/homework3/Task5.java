package com.zimenina.juliya.homework3;
/*
Task:
Write a program that displays a randomly generated
three-digit natural number and its largest digit.
(We use the Math or Random class)
 */
public class Task5 {
    public static void main(String[] args) {
        int randomNumber = 100 + ((int)(Math.random()*999));
        int number1 = randomNumber/100;
        int number2 = randomNumber%100/10;
        int number3 = randomNumber%10;

        int maxNumber = (Math.max(Math.max(number1, number2), number3));
        System.out.println("Generated three digit number " + randomNumber);
        System.out.println("Largest of three digits: " + maxNumber);
    }
}
