// A Java program to check weather the given string is Palindrome or not
package com.Laiba;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Enter any word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next(); // Taking input

        int length = word.length();
        for (int initial = 0; initial < length / 2; ++initial) {
            for (int end = length - initial - 1; end == length - initial - 1; --end) {
                if (word.charAt(initial) != word.charAt(end)) {
                    System.out.println("Not Palindrome!");
                    return;
                }
            }
        }
        System.out.println("Is Palindrome!");
    }
}
