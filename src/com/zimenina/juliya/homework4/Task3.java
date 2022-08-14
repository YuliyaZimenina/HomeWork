package com.zimenina.juliya.homework4;

import java.util.Scanner;

/*
Task 3:
Find:
Sum of all numbers from 100 to 500;
The sum of all integers from to 500
(the value of a is entered from the keyboard a <= 500);
The sum of all even numbers from a to b
(the value of a and b is entered from the keyboard b >= a);
Arithmetic mean of all integers from a to b
(the value of a and b is entered from the keyboard b >= 100);
 */
public class Task3 {
    public static void main(String[] args) {
        int sumAllNumbers = 0;


        System.out.println("Find the sum of all numbers from 100 to 500");

        for (int i = 100; i < 500; i++) {
            sumAllNumbers += i;
        }
        System.out.println("The sum of all numbers from 100 to 500 is:" +
                "" + sumAllNumbers);
        System.out.println();

        System.out.println("Find the sum of all even numbers from a to b");

        int firstResult = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter value A: ");
        int a = scanner.nextInt();
        System.out.println("The value A = " + a);
        for (; a <= 500; a++) {
            firstResult += a;
        }

        System.out.println("The sum all number from A to 500 is: " + firstResult);
        System.out.println();

        System.out.println("Find the sum of all even numbers from a to b");
        int secondResult = 0;
        System.out.println("Please, enter value A: ");
        a = scanner.nextInt();
        System.out.println("Please, enter value B: ");
        int b = scanner.nextInt();
        for (; a <= b; a++) {
            if (a % 2 == 0) {
                secondResult += a;
            }
        }
        System.out.println("The sum of all even numbers from a to b is: " + secondResult);

        System.out.println("Find the arithmetic mean of all integers from a to b\n" +
                "(the value of a and b is entered from the keyboard b >= 100);");
        System.out.println("Please, enter value A: ");
        a = scanner.nextInt();
        System.out.println("Please enter value B: ");
        b = scanner.nextInt();

        int count = 0;
        int thirdResult = 0;
        for (int i = a; i <= b; i++) {
            if (b >= 100) {
                thirdResult += i;
                count++;
            }
        }
        System.out.println("The arithmetic mean of all integers from A to B is: " + (thirdResult / count));
        scanner.close();
    }
}
