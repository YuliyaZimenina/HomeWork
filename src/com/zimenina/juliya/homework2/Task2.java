package com.zimenina.juliya.homework2;

import java.util.Scanner;

/*
Task2:
The user enters a value for the diameter of the circle.
You need to find the diameter of the circle.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for the radius of the circle: ");
        int radius = scanner.nextInt();
        int diameter = radius * 2;
        System.out.println("With radius value: " + radius + " ,the diameter of the circle is: " + diameter);
        scanner.close();
    }
}
