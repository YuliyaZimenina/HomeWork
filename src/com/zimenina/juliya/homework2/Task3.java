package com.zimenina.juliya.homework2;

/*
Task3:
Subtract the last digit from a three-digit number X. When the result is divided by 10,
and the last digit of the number X was added to the quotient on the left, then we got 237.
Find the number X and display it on the screen.
 */
public class Task3 {
    public static void main(String[] args) {
        int y = 237;
        int x = ((y % 100) * 10 + (y / 100));
        System.out.println("The hidden three-digit number X is equal to: " + x);
    }
}
