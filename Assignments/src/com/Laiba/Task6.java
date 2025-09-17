// A Java program to output fibonacci series until n num taken by user.

package com.Laiba;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // Input number
        System.out.println("Your Fibonacci Series till this number is: ");

            int current;
            int integer1 = 0;
            int integer2 = 1;
            System.out.print(integer2 + " ");
        for (int count = 0; count <= num ; ++count){
            current = integer1 + integer2; // current number is sum of previous two numbers
           int tempnum = current;
            integer1 = integer2;
            integer2 = tempnum;
            System.out.print(integer2 + " ");
        }
    }
}
