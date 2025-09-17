// A java program for finding Simple Interest, by asking principal, rate and time from user.
package com.Laiba;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Balance: ");
        int principal = input.nextInt(); // Input for principal
        System.out.print("Enter Annual Rate: ");
        int rate = input.nextInt(); // Input for rate
        System.out.print("Enter Time in years: ");
        int time = input.nextInt(); // Input for time

        int simpleInterest = (principal * rate * time)/100; // Simple Interest formula when time is in years
        System.out.println("Simple Interest is: " + simpleInterest); // Final Answer
    }
}
