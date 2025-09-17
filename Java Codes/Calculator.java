// Basic Calculator program in Java

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true) {
            /*
             Ask the user for an operator inside loop
             Otherwise everytime loop runs and operator is outside loop
             So, Same function will be performed again and again for each input of numbers
            */
        System.out.print("Enter a Operator: ");
        char operator = input.next().trim().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {

            /*
            If Operator is asked outside loop then
            Input must be taken inside loop so we change input each time loop runs
            otherwise if they are also taken outside it will keep operating again and again
            for the same inputs taken once and for the same operator
            and will be executed infinite times as while loop is always true
            */
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

                if (operator == '+') {
                    int sum;
                    sum = num1 + num2;
                    result = sum;
                }
                if (operator == '-') {
                    int subtraction;
                    subtraction = num1 - num2;
                    result = subtraction;
                }
                if (operator == '*') {
                    int multiply;
                    multiply = num1 * num2;
                    result = multiply;
                }
                if (operator == '/') {
                    if (num2 > 0) {
                        int divide;
                        divide = num1 / num2;
                        result = divide;
                    }
                }
                if (operator == '%') {
                    int modulus;
                    modulus = num1 % num2;
                    result = modulus;
                }
            }
            else if (operator == 'x' || operator == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operator!");
                    break;
            }
            System.out.println("Your answer is: " + result); // Print result inside loop
        }
    }
}
