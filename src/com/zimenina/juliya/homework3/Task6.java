package com.zimenina.juliya.homework3;

import java.util.Scanner;

/*
Task 6:
Write a calculator with basic arithmetic operations (+; -; *; /).
We ask the user for two integers and ask him to choose
the number of the desired operation.
For example:
1. addition
2. subtraction
If the user enters 1, perform the addition operation
(we use the switch multiple choice operator).
Provide for the selection of an unsupported operation.
We also perform a division-by-zero test and inform the user
that division by 0 is not allowed (using an if-else statement).
 */
public class Task6 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Please select an operation: +; -; *; /");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Your result is: " + result);
                break;
            case '/':
                if(secondNumber !=0){
                    result = firstNumber/secondNumber;
                    System.out.println("Your result is: " + result);
                }else {
                    System.out.println("You can't divide by 0!");
                }
                break;

            default:
                System.out.println("No such operation exists.");
        }

    }
}

