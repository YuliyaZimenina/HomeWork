package com.zimenina.juliya.homework4;

/*
Task1:
Print the conversion table 1, 2 ... 20 US dollars
to rubles at the current exchange rate.
The current exchange rate is entered from the keyboard
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate;
        System.out.println("Enter the current dollar rate: ");
        rate = scanner.nextDouble();
        System.out.println("Current dollar rate: " + rate);
        System.out.println(" ");
        System.out.println("Dollar to ruble conversion table: ");
        System.out.println(" ");
        for (int i = 1; i < 21; i++) {
            System.out.println(i + " \tUS dollars = "+ Math.ceil(i * rate) + " RUB");
        }
        scanner.close();
    }
}
