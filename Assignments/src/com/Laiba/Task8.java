// A java program to check which of given two numbers is Armstrong number or both are Armstrong
// Armstrong numbers are those which are equal to sum of cube of each of its individual digits
package com.Laiba;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt(); // Input first number
        System.out.print("Enter another number: ");
        int number2 = input.nextInt(); // Input second number

        int original = number1;
        int original2 = number2;
        int result = 0;
        int result1 = 0;
        while (number1 > 0 || number2 > 0) {
            int remainder = number1 % 10;
            int remainder1 = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            result = result + remainder * remainder * remainder;
            result1 = result1 + remainder1 * remainder1 * remainder1;
        }
        if (original == result) {
            System.out.println(original + " is Armstrong number!!");
        }
        if (original2 == result1) {
                System.out.println(original2 + " is Armstrong number!!");
        }
    }
}
