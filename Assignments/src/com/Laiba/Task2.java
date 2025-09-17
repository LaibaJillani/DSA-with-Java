// A Java program for taking name as input (String type) from user and printing a greeting message for user.
package com.Laiba;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // Input name from user can be full-name rather than just firstname
        String greeting = "Have a great day Dear "; // Greeting message

        System.out.println(greeting + name); // Printing message with name
    }
}
