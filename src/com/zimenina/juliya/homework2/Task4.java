package com.zimenina.juliya.homework2;

import java.util.Scanner;

/*Task 4.
A two-digit number is given.
Find:
1. The number of tens in it.
2. The number of units in it.
3. The sum of its digits.
4. The product of its digits.
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any two-digit number: ");
        int number = scanner.nextInt();
        System.out.println("The number of tens in the number you entered is equal to: " + number / 10);
        System.out.println("The number of units in the number you entered is equal to: " + number % 10);
        System.out.println("The sum of the digits of the number you entered is equal to: " + (number / 10 + number % 10));
        System.out.println("The product of the digits of the number you entered is equal to: " + ((number / 10) * (number % 10)));

        scanner.close();
    }
}
