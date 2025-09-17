// A java program where we take an int type input from user and check if it's an even number or odd.
package com.Laiba;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // Take input from user

        if (number % 2 == 0) { // If number / 2 gives 0 remainder it is an even number
            System.out.println("It's an Even number!");
        } else { // If remainder is not 0 it's an odd number
            System.out.println("It is an Odd number!");
        }
    }
}
