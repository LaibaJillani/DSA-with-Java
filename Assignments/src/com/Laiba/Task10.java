package com.Laiba;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;

        while (number > 0) {
            System.out.println("Enter a number: ");
            number = input.nextInt();

            if (number == 0) {
                break;
            }
        }

    }
}
