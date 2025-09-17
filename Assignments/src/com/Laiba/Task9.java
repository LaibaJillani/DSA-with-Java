// A Java program to check weather the given integer is Palindrome or not
package com.Laiba;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // Input number
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int remainder = number % 10; // Remainder method to get reverse of number
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        if (reverse == original) { // Checking if reverse equals to original
            System.out.println("Is Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }
    }
}
