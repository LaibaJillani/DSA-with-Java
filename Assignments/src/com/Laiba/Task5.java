// A Java program where we take input of Salary in Rupees and Output Salary in USD
package com.Laiba;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter Salary in Rupees: Rs." );
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); // Input of salary
        float answer = num1 / 283.38f; // Conversion formula
        System.out.println("Your Salary in USD is: " + answer + '$'); // Final output
    }
}
