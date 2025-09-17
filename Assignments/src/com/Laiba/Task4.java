package com.Laiba;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int maximum;

        if (num1 > num2) {
            maximum = num1;
            System.out.println("Maximum is: " + maximum);
        } else {
            maximum = num2;
            System.out.println("Maximum is: " + maximum);
        }
    }
}
