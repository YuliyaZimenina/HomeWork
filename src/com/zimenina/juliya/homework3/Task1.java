package com.zimenina.juliya.homework3;
/*
Task1:
We create three variables a, b, c and write any
values that are not equal.
Write a program which will rearrange the numbers
in the variables in such a way that so that when
they are displayed on the screen, the sequence a, b and c
turned out to be strictly increasing.
 */

public class Task1 {
    public static void main(String[] args) {
        int a = 21;
        int b = 15;
        int c = 9;

        int min = Math.min(Math.min(a,b),c);
        int max = Math.max(Math.max(a,b),c);
        b = (a + b + c) - min - max;
        a = min;
        c = max;
        System.out.println("Ascending sequence: " + a + ", " + b + ", " + c);
    }
}
