package com.zimenina.juliya.homework4;

/*
Task 9:
Display a triangle in the console using the "+" symbol.
 */

public class Task9 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}
