package com.zimenina.juliya.homework2;
// Задание 1. Значение х и а запрашиваем у
// пользователя при помощи сканнера

import java.util.Scanner;

/*
Task 1
Calculate next functions:
y = 7x^2 - 3x + 6
x = 12a^2 + 7a - 16
The value "x" and "a" are requested from the user.
Use the Scanner class for the request.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate the value of the function Y, please enter the value of X: ");
        int x = scanner.nextInt();
        System.out.println("When the value X = " + x + " the value of the Y function is:");
        System.out.println(7 * Math.pow(x,2) - 3 * x + 6);
        System.out.println("To calculate the value of the function X, please enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("When the value A = " + a + " the value of the X function is:");
        System.out.println(12 * Math.pow(a,2) + 7 * a - 16);
        scanner.close();
    }
}
