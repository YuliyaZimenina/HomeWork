package com.zimenina.juliya.homework4;

/*
Task2
Display a series of Fibonacci numbers,
consisting of n elements.
Fibonacci numbers, are elements of a numerical sequence
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
 */

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;

        System.out.print(firstNumber + ", ");
        for (int i = 1; i < 30; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(secondNumber + ", ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        System.out.println();
    }
}
