package com.zimenina.juliya.homework2;

import java.util.Scanner;

/*
Task5:
Find the perimeter of a square given its side.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the side of the square: ");
        int sideLength = scanner.nextInt();
        int perimeter = sideLength * 4;
        System.out.println("The perimeter of the square is: " + perimeter);

        scanner.close();
    }
}
