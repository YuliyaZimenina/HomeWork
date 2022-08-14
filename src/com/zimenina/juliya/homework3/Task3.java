package com.zimenina.juliya.homework3;

import java.util.Scanner;

/*
We ask the user for a number.
We check whether the integer written into the number variable is even or odd.
We output information to the console.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your number");
        int number = scanner.nextInt();
        System.out.println("You entered a number: " + number);
        if (number%2 ==0){
            System.out.println("Number "+ number + " is even");
        }else {
            System.out.println("Number "+ number + " is odd");
        }

    }
}
